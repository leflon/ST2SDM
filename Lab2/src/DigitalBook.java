public class DigitalBook extends Book {
   private int maxLicenses;
   private int availableLicenses;
 
   public DigitalBook(..., int maxLicenses, int availableLicenses) {
       super(...); // Call Book constructor
       this.maxLicenses = maxLicenses;
       this.availableLicenses = availableLicenses;
   }
 
   // Getters and setters
}