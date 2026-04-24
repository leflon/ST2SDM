public class DigitalBook extends Book implements Renewable {
   private int maxLicenses;
   private int availableLicenses;
 
   public DigitalBook(String title, String author, String category, String ISBN, String language,
                      int publicationYear, String bookID, boolean isRestricted, String series,
                      int maxLicenses, int availableLicenses, DigitalBookBorrowingPolicy borrowingPolicy) {
       super(title, author, category, ISBN, language, publicationYear, bookID, isRestricted, series); // Call Book constructor
       this.maxLicenses = maxLicenses;
       this.availableLicenses = availableLicenses;
       this.borrowingPolicy = borrowingPolicy;
   }

   @Override
    public void renew(Subscriber subscriber) {
        // Implement renewal logic here
        System.out.println("Renewing license for book for subscriber: " + subscriber.getName());
    }
 
   // Getters and setters
    public int maxLicenses() { return maxLicenses; }
    public int availableLicenses() { return availableLicenses; }
    public void setMaxLicenses(int maxLicenses) { this.maxLicenses = maxLicenses; }
    public void setAvailableLicenses(int availableLicenses) { this.availableLicenses = availableLicenses; }
}