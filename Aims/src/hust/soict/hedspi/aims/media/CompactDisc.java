package Aims.src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc {
    private int id;
    private static int nbCDs;
    private String title;
    private String category;
    private String artist;
    private String director;
    private float cost;
    private int length;
    private List<Track> tracks;

    public int getId() {
        return id;
    }

    public static int getNbCDs() {
        return nbCDs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<Track> getTracks() {
        return tracks;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public CompactDisc(String title, String category, String artist, String director, float cost) {
        this.title = title;
        this.category = category;
        this.artist = artist;
        this.director = director;
        this.cost = cost;
        this.length = 0;
        this.tracks = new ArrayList<>();
        nbCDs++;
        id = nbCDs;
    }

    @Override
    public String toString() {
        return "CD - " + this.title + " - " + this.category + " - " + this.artist + " - " + this.director + " - " + this.length + " mins: " + this.cost + " $";
    }
}
