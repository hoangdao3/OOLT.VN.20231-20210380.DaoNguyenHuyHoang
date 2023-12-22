package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;

import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.store.Store;

import java.awt.*;
import java.awt.event.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen{
    private JTextField tfDirector;
    private JTextField tfLength;
    private JTextField tfArtist;
    private JButton addButton;
    private CompactDisc cd;

    public AddCompactDiscToStoreScreen(Store store) {
        super("CD");
        setJMenuBar(MenuBarCreator.createMenuBar(store));
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(7,2));
        
        cp.add(new Label("Please enter the director of the CD: "));
        tfDirector = new JTextField(100);
        cp.add(tfDirector);
        cp.add(new Label("Please enter the length of the CD: "));
        tfLength = new JTextField(100);
        cp.add(tfLength);
        cp.add(new Label("Please enter the artist of the CD: "));
        tfArtist = new JTextField(100);
        cp.add(tfArtist);

        addButton = new JButton("Add to Store");
        cp.add(addButton);
        setVisible(true);

        class AddButtonActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                cd = new CompactDisc(tfTitle.getText(), tfCategory.getText(), tfDirector.getText(), 
                    Integer.parseInt(tfLength.getText()), Float.parseFloat(tfCost.getText()), tfArtist.getText());
                store.addMedia(cd);   

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
