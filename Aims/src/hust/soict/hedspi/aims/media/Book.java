package Aims.src.hust.soict.hedspi.aims.media;

//import hust.soict.hedspi.aims.media.Media;
import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors;

    public Book(int id, String title, String category, float cost) {
        super();
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        }
    }

    public void removeAuthor(String authorName) {
        authors.remove(authorName);
    }
}
