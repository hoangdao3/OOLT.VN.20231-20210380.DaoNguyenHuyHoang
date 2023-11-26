package Aims.src;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class Main {
    public static void main(String[] args) {

        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderelllaDVD = new DigitalVideoDisc("Cinderella");
        swapp(jungleDVD, cinderelllaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd tille: " + cinderelllaDVD.getTitle());
        changeTitle(jungleDVD, cinderelllaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }
    public static void swapp(Object o1, Object o2){
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
//        System.out.println(o1);
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title){
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}