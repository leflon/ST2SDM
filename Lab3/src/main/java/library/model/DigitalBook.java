package library.model;

public class DigitalBook extends Book {
    private int maxLicenses;
    private int availableLicenses;

    public DigitalBook(String id, String title, String author, String category,
                       String isbn, String language, int publicationYear,
                       boolean restrictedAccess, int maxLicenses) {
        super(id, title, author, category, isbn, language, publicationYear, restrictedAccess);
        this.maxLicenses = maxLicenses;
        this.availableLicenses = maxLicenses;
    }

    @Override
    public boolean isAvailable() {
        return availableLicenses > 0;
    }

    @Override
    public void borrow() {
        if (!isAvailable()) {
            throw new IllegalStateException("No digital licenses available for: " + title);
        }
        availableLicenses--;
    }

    @Override
    public void returnBook() {
        if (availableLicenses < maxLicenses) {
            availableLicenses++;
        }
    }

    public int getMaxLicenses() { return maxLicenses; }
    public void setMaxLicenses(int maxLicenses) { this.maxLicenses = maxLicenses; }
    public int getAvailableLicenses() { return availableLicenses; }
    public void setAvailableLicenses(int availableLicenses) { this.availableLicenses = availableLicenses; }
}
