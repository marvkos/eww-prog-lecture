package at.technikum.simpleclasses.library;

public class Book extends Item implements Rentable {

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

    @Override
    public String getObjectName() {
        return "Book " + title + " " + author;
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

    @Override
    public boolean rent(Member member) {
        setRentedBy(member);

        return true;
    }

    @Override
    public void returnItem() {
        setRentedBy(null);
    }

    @Override
    public boolean isAvailable() {
        return getAvailability() == Availability.FREE;
    }
}
