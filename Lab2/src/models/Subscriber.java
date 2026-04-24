import java.util.List;
import java.util.ArrayList;
 
public class Subscriber {
   private String name;
   private String id;
   private String email;
   private String contact;
   private List<Borrowing> borrowedBooks;
   private boolean isSuspended;
 
   public Subscriber(String name, String id, String email, String contact) {
       this.name = name;
       this.id = id;
       this.email = email;
       this.contact = contact;
       this.borrowedBooks = new ArrayList<>();
       this.isSuspended = false;
   }
 
   public int getBorrowedBooksCount() {
       return borrowedBooks.size();
   }
   // Getters and setters
}