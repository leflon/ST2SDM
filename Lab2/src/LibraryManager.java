import java.util.*;
 
public class LibraryManager {
   private static LibraryManager instance;
 
   private List<Book> books = new ArrayList<>();
   private List<Subscriber> subscribers = new ArrayList<>();
   private List<Borrowing> borrowings = new ArrayList<>();
   private List<Reservation> reservations = new ArrayList<>();
   private List<Penalty> penalties = new ArrayList<>();
 
   private LibraryManager() {}
 
   public static synchronized LibraryManager getInstance() {
       if (instance == null) {
           instance = new LibraryManager();
       }
       return instance;
   }
 
   public void addBook(Book book) { books.add(book); }
 
   public void removeBook(Book book) { books.remove(book); }
 
   public void register(Subscriber s) { subscribers.add(s); }
 
   public void borrowBook(Subscriber s, Book b) {
       // Logic to borrow a book
   }
 
   public void returnBook(Borrowing b) {
       // Logic to return a book
   }
 
   public void reserveBook(Subscriber s, Book b) {
       // Logic to reserve
   }
 
   public double calculatePenalty(Borrowing b) {
       // Calculate penalty logic here
       return 0;
   }
 
   // Other utility methods
}