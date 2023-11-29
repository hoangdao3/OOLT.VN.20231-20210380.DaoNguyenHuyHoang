package Aims.src.hust.soict.hedspi.aims.media;

<<<<<<< HEAD
public class DigitalVideoDisc extends Media implements Playable {
    private String director;
    private int length;
    private float cost;
    private static int nbDigitalVideoDisc;
=======
public class DigitalVideoDisc {
    private String title;
    private String catetory;
    private String director;
    private int length;
    private float cost;
    private  int id;
    private static int nbDigitalVideoDisc;
    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
>>>>>>> remotes/origin/finish-section-6

    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }

<<<<<<< HEAD
=======
    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatetory() {
        return catetory;
    }

    public void setCatetory(String catetory) {
        this.catetory = catetory;
    }
>>>>>>> remotes/origin/finish-section-6

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
<<<<<<< HEAD
    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public DigitalVideoDisc(int id, String title, String category, float cost) {
        super();
    }

    public DigitalVideoDisc(String catetory, String director, int length) {
        super();
=======

    public DigitalVideoDisc(String catetory, String director, int length) {
>>>>>>> remotes/origin/finish-section-6
        this.catetory = catetory;
        this.director = director;
        this.length = length;
        nbDigitalVideoDisc++;
        id = nbDigitalVideoDisc;
    }
    public boolean isMatch(String title) {
        return this.title.toLowerCase().equals(title.toLowerCase());
    }

    @Override
    public String toString() {
        return "DVD - " + this.title + " - " + this.catetory + " - " + this.director + " - " + this.length + ": " + this.cost + " $";
    }

    public DigitalVideoDisc(String title, String catetory, String director, float cost) {
<<<<<<< HEAD
        super();
=======
>>>>>>> remotes/origin/finish-section-6
        this.title = title;
        this.catetory = catetory;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String catetory, float cost) {
<<<<<<< HEAD
        super();
=======
>>>>>>> remotes/origin/finish-section-6
        this.title = title;
        this.catetory = catetory;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
<<<<<<< HEAD
        super();
=======
>>>>>>> remotes/origin/finish-section-6
        this.title = title;
    }

    public DigitalVideoDisc(String title, String catetory, String director, int length, float cost) {
<<<<<<< HEAD
        super();
=======
>>>>>>> remotes/origin/finish-section-6
        this.title = title;
        this.catetory = catetory;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
