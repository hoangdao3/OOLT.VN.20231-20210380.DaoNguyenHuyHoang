package hust.soict.hedspi.aims.screen.manager;

import java.awt.*;
import javax.swing.*;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store; 

import java.awt.event.*;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfDirector;
    private JTextField tfLength;
    private DigitalVideoDisc dvd;
    private JButton addButton;
    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super("DVD");
        setJMenuBar(MenuBarCreator.createMenuBar(store));
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(6,2));       

        cp.add(new Label("Please enter the director of the DVD: "));
        tfDirector = new JTextField(100);
        cp.add(tfDirector);
        cp.add(new Label("Please enter the length of the DVD: "));
        tfLength = new JTextField(100);
        cp.add(tfLength);

        addButton = new JButton("Add to Store");
        cp.add(addButton);
        setVisible(true);


        class AddButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                dvd = new DigitalVideoDisc(tfTitle.getText(), tfCategory.getText(), 
                    tfDirector.getText(), Integer.parseInt(tfLength.getText()), Float.parseFloat(tfCost.getText()));
                store.addMedia(dvd);

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

