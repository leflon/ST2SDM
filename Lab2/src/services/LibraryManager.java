public class LibraryManager {
   private static LibraryManager instance;
 
   private IBookRepository bookRepository;
   private IBorrowingManager borrowingManager;
 
   private LibraryManager(IBookRepository bookRepository, IBorrowingManager borrowingManager) {
        this.bookRepository = bookRepository;
        this.borrowingManager = borrowingManager;
   }
 
   public static synchronized LibraryManager getInstance() {
       if (instance == null) {
           instance = new LibraryManager();
       }
       return instance;
   }
}