package Aims.src.hust.soict.hedspi.aims.media;

public abstract class Media {
    protected int id;
    protected String title;
    protected String catetory;
    protected float cost;

    public Media() {
    }

    // Constructors, if needed, can be added here

    // Getters and setters for the fields
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatetory() {
        return catetory;
    }

    public void setCatetory(String category) {
        this.catetory = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
