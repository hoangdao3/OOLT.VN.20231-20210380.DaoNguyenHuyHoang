package Aims.src.hust.soict.hedspi.aims.media;
public class Track {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }
    public void play() {
        System.out.println("Playing track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Track)) {
            return false;
        }
        Track otherTrack = (Track) obj;
        return this.getTitle().equals(otherTrack.getTitle()) &&
                this.getLength() == otherTrack.getLength();
    }
}
