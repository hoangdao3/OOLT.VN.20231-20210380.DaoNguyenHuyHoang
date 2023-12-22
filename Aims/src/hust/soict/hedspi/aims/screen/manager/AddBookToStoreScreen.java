package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

public class AddBookToStoreScreen extends AddItemToStoreScreen  {
    private JButton addButton;
    private Book book;

    public AddBookToStoreScreen(Store store) {
        super("Book");
        setJMenuBar(MenuBarCreator.createMenuBar(store));
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4,2));

        addButton = new JButton("Add to Store");
        cp.add(addButton);
        setVisible(true);

        class AddButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                book = new Book(tfTitle.getText(), tfCategory.getText(), Float.parseFloat(tfCost.getText()));
                store.addMedia(book);
                
                JDialog dialog = new JDialog();
                dialog.setLayout(new FlowLayout());
                JLabel label = new JLabel("Added to the store");
                dialog.add(label);
                dialog.setSize(400, 150);
                dialog.setVisible(true);
            }
        }
        addButton.addActionListener(new AddButtonActionListener());

    }
}

