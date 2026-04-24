public class PhysicalBook extends Book {
   private int copyCount;
   private int availableCopies;
 
   public PhysicalBook(..., int copyCount, int availableCopies) {
       super(...); // Call Book constructor
       this.copyCount = copyCount;
       this.availableCopies = availableCopies;
   }
 
   // Getters and setters
}