package hust.soict.hedspi.aims.screen.customer.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import hust.soict.hedspi.aims.media.*;

import javax.naming.LimitExceededException;

import hust.soict.hedspi.aims.cart.Cart;  

public class ItemController {
    private Media media;
    private Cart cart;

    public ItemController(Cart cart) {
        this.cart = cart;
    }

    @FXML
    private Button btnAddToCart;

    @FXML
    private Button btnPlay;

    @FXML
    private Label lblCost;

    @FXML
    private Label lblTitle;

    @FXML
    
    void btnAddToCartClicked(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Add to Cart");
        alert.setHeaderText(null);
        Alert warning = new Alert(Alert.AlertType.WARNING);
        warning.setTitle("Add to Cart");
        warning.setHeaderText(null);
    
        try {
            if (cart.findMediaInCart(media.getTitle()) != null) {
                warning.setContentText("Media is already in Cart! Cannot add to Cart");
                warning.showAndWait();
            }
            else {
                cart.addMedia(media);
                alert.setContentText("Added media to the Cart");
                alert.showAndWait();
            }
        } catch (LimitExceededException e) {
            warning.setContentText("The cart is full! Cannot add to the cart");
            warning.showAndWait();
        }
    }


    @FXML
    void btnPlayClicked(ActionEvent event) {
        try {
            final String PLAY_FXML_FILE_PATH = "/hust/soict/hedspi/aims/screen/customer/view/Play.fxml";
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(PLAY_FXML_FILE_PATH));
            fxmlLoader.setController(new PlayController(media));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Play");
            stage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setData(Media media) {
        this.media = media;
        lblTitle.setText(media.getTitle());
        lblCost.setText(media.getCost() + "$");

        if (media instanceof Playable) {
            btnPlay.setVisible(true);
        } else {
            btnPlay.setVisible(false);
            HBox.setMargin(btnAddToCart, new Insets(0, 0, 0, 60));
        }
    }
}
    

