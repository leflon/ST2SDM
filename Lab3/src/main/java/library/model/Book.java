package library.model;

public abstract class Book {
    protected String id;
    protected String title;
    protected String author;
    protected String category;
    protected String isbn;
    protected String language;
    protected int publicationYear;
    protected boolean restrictedAccess;

    public Book(String id, String title, String author, String category,
                String isbn, String language, int publicationYear, boolean restrictedAccess) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.isbn = isbn;
        this.language = language;
        this.publicationYear = publicationYear;
        this.restrictedAccess = restrictedAccess;
    }

    public abstract boolean isAvailable();
    public abstract void borrow();
    public abstract void returnBook();

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public String getIsbn() { return isbn; }
    public String getLanguage() { return language; }
    public int getPublicationYear() { return publicationYear; }
    public boolean isRestrictedAccess() { return restrictedAccess; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{id='" + id + "', title='" + title + "', author='" + author + "'}";
    }
}
