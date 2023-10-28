public class DigitalVideoDisc {
    private String title;
    private String catetory;
    private String director;
    private int length;
    private float cost;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatetory() {
        return catetory;
    }

    public void setCatetory(String catetory) {
        this.catetory = catetory;
    }

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

    public DigitalVideoDisc(String title, String catetory, String director, float cost) {
        this.title = title;
        this.catetory = catetory;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String catetory, float cost) {
        this.title = title;
        this.catetory = catetory;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public DigitalVideoDisc(String title, String catetory, String director, int length, float cost) {
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
