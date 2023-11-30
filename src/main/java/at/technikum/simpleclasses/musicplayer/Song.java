package at.technikum.simpleclasses.musicplayer;

public class Song {

    private String title;

    private String artist;

    private String genre;

    private int length;

    public Song(
            String title,
            String artist,
            String genre,
            int length
    ) {
        // this.title = title;
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setLength(length);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setLength(int length) {
        if (0 > length) {
            this.length = 0;
            return;
        }

        this.length = length;
    }

    public int getLength() {
        return this.length;
    }
}
