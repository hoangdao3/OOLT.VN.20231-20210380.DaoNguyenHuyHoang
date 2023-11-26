package Aims.src.hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String catetory;
    protected float cost;
    public static Comparator<Media> titleThenCostComparator = Comparator
            .comparing(Media::getTitle)
            .thenComparing(Media::getCost, Comparator.reverseOrder());

    public static Comparator<Media> costThenTitleComparator = Comparator
            .comparing(Media::getCost, Comparator.reverseOrder())
            .thenComparing(Media::getTitle);
    public Media() {
    }

    // Constructors, if needed, can be added here

    // Getters and setters for the fields
    public int getId() {
        return id;
    }
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Media)) {
            return false;
        }
        Media otherMedia = (Media) obj;
        return this.getTitle().equals(otherMedia.getTitle());
    }
}
