package Aims.src.hust.soict.hedspi.aims.store;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Store {
    private DigitalVideoDisc[] itemsInStore;
    private int totalItems;

    public Store(int maxSize) {
        itemsInStore = new DigitalVideoDisc[maxSize];
        totalItems = 0;
    }

    public void addDVD(DigitalVideoDisc dvd) {
        if (totalItems < itemsInStore.length) {
            itemsInStore[totalItems] = dvd;
            totalItems++;
            System.out.println("DVD added to the store.");
        } else {
            System.out.println("The store is full. Cannot add more DVDs.");
        }
    }

    public void removeDVD(DigitalVideoDisc dvd) {
        boolean found = false;
        for (int i = 0; i < totalItems; i++) {
            if (itemsInStore[i].equals(dvd)) {
                found = true;
                for (int j = i; j < totalItems - 1; j++) {
                    itemsInStore[j] = itemsInStore[j + 1];
                }
                itemsInStore[totalItems - 1] = null;
                totalItems--;
                System.out.println("DVD removed from the store.");
                break;
            }
        }
        if (!found) {
            System.out.println("DVD not found in the store.");
        }
    }
}
