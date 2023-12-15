package at.technikum.simpleclasses.library;

public class AudioBook extends Item {


    private String isbn;

    private String title;

    private Author author;

    private int length;

    public AudioBook(
            String id,
            String isbn,
            String title,
            Author author,
            int length
    ) {
        super(id);
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.length = length;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String getObjectName() {
        return null;
    }
}
