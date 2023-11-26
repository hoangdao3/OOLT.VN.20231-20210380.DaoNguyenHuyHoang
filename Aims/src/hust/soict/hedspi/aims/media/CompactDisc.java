package Aims.src.hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks;

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String artist, ArrayList<Track> tracks, int length, String director, int id, String title, String category, float cost) {
        super(length, director, id, title, category, cost);
        this.artist = artist;
        this.tracks = tracks;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists in the CD!");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Track does not exist in the CD!");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
}