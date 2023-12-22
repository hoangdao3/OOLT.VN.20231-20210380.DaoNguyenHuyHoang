import com.sun.deploy.cache.CacheEntry;
import hust.soict.hedspi.swing.AddItemToStoreScreen;
import hust.soict.hedspi.swing.DigitalVideoDisc;
import hust.soict.hedspi.swing.Store;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add Digital Video Disc");
        AbstractButton btnAdd = null;
        btnAdd.addActionListener((ActionListener) new btnAddListener());
    }

    private void setTitle(String addDigitalVideoDisc) {

    }

    private class btnAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            CacheEntry.SessionSigningDataStorage tfs = null;
            String title = tfs.get(0).getText();
            String category = tfs.get(1).getText();
            float cost = Float.parseFloat(tfs.get(2).getText());

            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, cost);
            Object store;
            store.addMedia(dvd);
        }
    }
}
