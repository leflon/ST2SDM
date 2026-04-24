import java.util.*;
 
public class LibraryManager {
   private static LibraryManager instance;
 
   private List<Book> books = new ArrayList<>();
 
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

 
   // Other utility methods
}