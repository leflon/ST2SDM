import java.util.Date;
 
public class Reservation {
   private Subscriber subscriber;
   private Book book;
   private Date reservationDate;
   private Date expirationDate;
 
   public Reservation(Subscriber subscriber, Book book, Date reservationDate, Date expirationDate) {
       this.subscriber = subscriber;
       this.book = book;
       this.reservationDate = reservationDate;
       this.expirationDate = expirationDate;
   }
 
   // Getters and setters
}