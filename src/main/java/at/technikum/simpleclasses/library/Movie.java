package at.technikum.simpleclasses.library;

public class Movie extends Item {

    private String title;

    private int rating;

    public Movie(String id, String title) {
        super(id);
        this.title = title;
    }

    @Override
    public String getObjectName() {
        return "Rating of the movie: " + rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
