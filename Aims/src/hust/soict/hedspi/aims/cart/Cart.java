package Aims.src.hust.soict.hedspi.aims.cart;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

import java.text.DecimalFormat;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered - 1 == MAX_NUMBER_ORDERED ){
            System.out.println("The cart is almost full");
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int check = 0;
        for (int i = 0; i <= qtyOrdered; i++) {
            if (disc.equals(itemsOrdered[i])) {
                check = i;
            }
        }
        if(check >= 0) {
            for (int i = check; i <= qtyOrdered; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
                System.out.println("The disc has been deleted");
            }
        }
        else {
            System.out.println("Don't have the disc in the cart");
        }
        qtyOrdered--;
    }
    public void printOrder() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found DVD - " + itemsOrdered[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No match found for ID: " + id);
        }
    }
    public void searchByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(title)) {
                System.out.println("Found DVD - " + itemsOrdered[i].toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No match found for title: " + title);
        }
    }

    public String totalCost(){
        double totalCost = 0;
        for(int i = 0; i < qtyOrdered; i++){
            totalCost += itemsOrdered[i].getCost();
        }
        double number = totalCost;
        DecimalFormat df = new DecimalFormat("0.00");

        // Sử dụng mẫu định dạng để định dạng số
        String formattedNumber = df.format(number);
//        System.out.println(formattedNumber);
//        System.out.println("total cost: " + totalCost);
        return formattedNumber;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        for(int i = 0; i < dvdList.length; i++){
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered++;
        }
        System.out.println("Add list complete");
    }
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        itemsOrdered[qtyOrdered] = dvd1;
        itemsOrdered[qtyOrdered + 1] = dvd2;
        qtyOrdered += 2;
    }

}
