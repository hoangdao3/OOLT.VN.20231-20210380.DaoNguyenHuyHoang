package Aims.src.hust.soict.hedspi.aims.media;

public class Disc extends Media {
    private int length;
    private String director;

    public int getLength() {
        return length;
    }

    public String getDirector() {
        return director;
    }

    public Disc(int length, String director, int id, String title, String category, float cost) {
        super();
        this.length = length;
        this.director = director;
    }
}
