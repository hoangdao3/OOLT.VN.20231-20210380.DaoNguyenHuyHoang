package Aims.src;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Aims.src.hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Media> media = new ArrayList<Media>();
//        media.add(cd)
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