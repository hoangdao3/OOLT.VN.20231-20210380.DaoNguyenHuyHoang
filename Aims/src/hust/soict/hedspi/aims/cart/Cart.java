package Aims.src.hust.soict.hedspi.aims.cart;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Aims.src.hust.soict.hedspi.aims.media.Media;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
    }

    public float totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
}