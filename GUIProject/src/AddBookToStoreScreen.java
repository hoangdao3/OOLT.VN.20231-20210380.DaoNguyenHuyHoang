import hust.soict.hedspi.swing.AddItemToStoreScreen;
import hust.soict.hedspi.swing.Store;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.Book;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store) {
        super(store);
        setTitle("Add Book");
        AbstractButton btnAdd;
        btnAdd.addActionListener(new btnAddListener());
    }

    private void setTitle(String addBook) {

    }

    private class btnAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String title = tfs.get(0).getText();
            String category = tfs.get(1).getText();
            float cost = Float.parseFloat(tfs.get(2).getText());

            Book book = new Book(title, category, cost);
            Object store;
            store.addMedia(book);
        }
    }
}
