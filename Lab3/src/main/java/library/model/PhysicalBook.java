package library.model;

public class PhysicalBook extends Book {
    private int totalCopies;
    private int availableCopies;

    public PhysicalBook(String id, String title, String author, String category,
                        String isbn, String language, int publicationYear,
                        boolean restrictedAccess, int totalCopies) {
        super(id, title, author, category, isbn, language, publicationYear, restrictedAccess);
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    @Override
    public boolean isAvailable() {
        return availableCopies > 0;
    }

    @Override
    public void borrow() {
        if (!isAvailable()) {
            throw new IllegalStateException("No physical copies available for: " + title);
        }
        availableCopies--;
    }

    @Override
    public void returnBook() {
        if (availableCopies < totalCopies) {
            availableCopies++;
        }
    }

    public int getTotalCopies() { return totalCopies; }
    public void setTotalCopies(int totalCopies) { this.totalCopies = totalCopies; }
    public int getAvailableCopies() { return availableCopies; }
    public void setAvailableCopies(int availableCopies) { this.availableCopies = availableCopies; }
}
