package at.technikum.simpleclasses.library;

public class Book extends Item {

    private String isbn;

    private String title;

    private Author author;

    private int pages;

    public Book(
            String id,
            String isbn,
            String title,
            Author author,
            int pages
    ) {
        super(id); // new Item(id)
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pages = pages;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
