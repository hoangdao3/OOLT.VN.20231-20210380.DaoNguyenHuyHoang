package Aims.src.hust.soict.hedspi.aims.store;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Aims.src.hust.soict.hedspi.aims.media.Media;


import java.util.ArrayList;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();

    public void addMedia(Media media) {
        itemsInStore.add(media);
        System.out.println("Media added to the store.");
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
            itemsInStore.remove(media);
            System.out.println("Media removed from the store.");
        } else {
            System.out.println("Media not found in the store.");
        }
    }
}
