package hust.soict.hedspi.aims.screen.customer.store;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.screen.customer.controller.ViewStoreController;
import javafx.scene.Scene;
import javafx.stage.Stage;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.cart.Cart;

public class TestViewStoreScreen extends Application{
    private static Store store;
    private static Cart cart;

    @Override
    public void start(Stage primaryStage) throws Exception {
        final String STORE_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(store, cart);
        fxmlLoader.setController(viewStoreController);
        Parent root = fxmlLoader.load();

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }   

    public static void main(String[] args) {
        store = new Store();
        cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 
            "Animation","Roger Allers", 87, 19.95f);
        store.addMedia(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
            "Science Fiction","George Lucas", 87, 24.95f);
        store.addMedia(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
            "Animation", 18.99f);
        store.addMedia(dvd3);

        CompactDisc cd1 = new CompactDisc("Baby One More Time", 
            "Pop", "Jive Records", 20, 15.99f,"Britney Spears");
        Track track1 = new Track("Baby One More Time", 3);
        Track track2 = new Track("You Drive Me Crazy", 3);
        Track track3 = new Track("Sometimes", 3);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.addTrack(track3);
        store.addMedia(cd1);

        Book book1 = new Book(1, "Harry Potter", "Fantasy", 20f);
        store.addMedia(book1);
        Book book2 = new Book(2, "Deezer", "Action", 69f);
        store.addMedia(book2);
        launch(args);
    }

}
