import java.util.Date;
 
public class Borrowing {
   private Subscriber subscriber;
   private Book book;
   private Date borrowDate;
   private Date dueDate;
   private Date returnedDate;
   private boolean isRenewed;
 
   public Borrowing(Subscriber subscriber, Book book, Date borrowDate, Date dueDate) {
       this.subscriber = subscriber;
       this.book = book;
       this.borrowDate = borrowDate;
       this.dueDate = dueDate;
       this.isRenewed = false;
   }

   public boolean isOverdue() {
         if (returnedDate != null) {
              return returnedDate.after(dueDate);
         }
         return new Date().after(dueDate);
   }
 
   // Getters and setters
}