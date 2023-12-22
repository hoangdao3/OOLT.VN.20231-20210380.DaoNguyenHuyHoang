package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import hust.soict.hedspi.aims.store.Store;

public class MenuBarCreator extends JFrame {
    public static JMenuBar createMenuBar(Store store) {
        JMenu menu = new JMenu("Options");
        
        JMenuItem smViewStore = new JMenuItem("View store");
        smViewStore.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new StoreManagerScreen(store);
            }
        });
        menu.add(smViewStore);

        JMenu smUpdateStore = new JMenu("Update store");
        JMenuItem addBook = new JMenuItem("Add book");
        addBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddBookToStoreScreen(store);
            }
        });
        smUpdateStore.add(addBook);

        JMenuItem addDVD = new JMenuItem("Add DVD");
        addDVD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddDigitalVideoDiscToStoreScreen(store);
            }
        });
        smUpdateStore.add(addDVD);

        JMenuItem addCD = new JMenuItem("Add CD");
        addCD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddCompactDiscToStoreScreen(store);
            }
        });
        smUpdateStore.add(addCD);
        
        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }
}
