import com.sun.deploy.cache.CacheEntry;
import hust.soict.hedspi.swing.AddItemToStoreScreen;
import hust.soict.hedspi.swing.CompactDisc;
import hust.soict.hedspi.swing.Store;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add Compact Disc");
        AbstractButton btnAdd = null;
        btnAdd.addActionListener((ActionListener) new btnAddListener());
    }

    private void setTitle(String addCompactDisc) {

    }

    private abstract class btnAddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            CacheEntry.SessionSigningDataStorage tfs;
            String title = tfs.get(0).getText();
            String category = tfs.get(1).getText();
            float cost = Float.parseFloat(tfs.get(2).getText());

            CompactDisc cd = new CompactDisc(title, category, cost);
            Object store;
            store.addMedia(cd);
        }
    }
}

