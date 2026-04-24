public class PhysicalBook extends Book implements PenaltyApplicable, Reservable {
   private int copyCount;
   private int availableCopies;
 
   public PhysicalBook(String title, String author, String category, String ISBN, String language,
                       int publicationYear, String bookID, boolean isRestricted, String series,
                       int copyCount, int availableCopies, PhysicalBookBorrowingPolicy borrowingPolicy) {
       super(title, author, category, ISBN, language, publicationYear, bookID, isRestricted, series);
       this.copyCount = copyCount;
       this.availableCopies = availableCopies;
       this.borrowingPolicy = borrowingPolicy;
   }

   @Override
   public calculatePenalty(int daysLate) {
      return daysLate * 2.0; // Example penalty calculation: $2 per day late
   }

   @Override
   public void reserve(Subscriber subscriber) {
      // Implement reservation logic here
   }
 
   // Getters and setters
   public int copyCount() { return copyCount; }
   public int availableCopies() { return availableCopies; }
   public void setCopyCount(int copyCount) { this.copyCount = copyCount; }
   public void setAvailableCopies(int availableCopies) { this.availableCopies = availableCopies; }
}