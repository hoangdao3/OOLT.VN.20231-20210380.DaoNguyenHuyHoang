<<<<<<< HEAD
package Aims.src;

import Aims.src.hust.soict.hedspi.aims.media.DigitalVideoDisc;
import Aims.src.hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;
import java.util.List;
=======
import java.text.DecimalFormat;

import static java.util.Collections.swap;
>>>>>>> remotes/origin/finish-section-4

public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        List<Media> media = new ArrayList<Media>();
//        media.add(cd)
=======
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderelllaDVD = new DigitalVideoDisc("Cinderella");
        swapp(jungleDVD, cinderelllaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd tille: " + cinderelllaDVD.getTitle());
        changeTitle(jungleDVD, cinderelllaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
>>>>>>> remotes/origin/finish-section-4
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