package library.service;

import library.factory.BorrowingFactory;
import library.model.Book;
import library.model.Borrowing;
import library.model.Reservation;
import library.model.Subscriber;
import library.observer.LibraryEvent;
import library.observer.LibraryEventListener;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BorrowingService implements IBorrowingService {
    private final List<LibraryEventListener> listeners = new ArrayList<>();
    private List<Borrowing> borrowings = new ArrayList<>();
    private final IBookService bookService;
    private final ISubscriberService subscriberService;
    private final BorrowingFactory borrowingFactory;

    public BorrowingService(IBookService bookService, ISubscriberService subscriberService,
                            BorrowingFactory borrowingFactory) {
        this.bookService = bookService;
        this.subscriberService = subscriberService;
        this.borrowingFactory = borrowingFactory;
    }

    public void registerObserver(LibraryEventListener listener) {
        listeners.add(listener);
    }

    public void unregisterObserver(LibraryEventListener listener) {
        listeners.remove(listener);
    }

    private void notifyObservers(LibraryEvent event) {
        listeners.forEach(l -> l.update(event));
    }

    @Override
    public void borrowBook(String subscriberId, String bookId) {
        Subscriber subscriber = subscriberService.findById(subscriberId);
        if (subscriber == null) {
            throw new IllegalArgumentException("Subscriber not found: " + subscriberId);
        }
        Book book = bookService.getBookById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + bookId);
        }
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book is not available: " + bookId);
        }
        book.borrow();
        borrowings.add(borrowingFactory.createBorrowing(subscriber, book));
    }

    @Override
    public void returnBook(String borrowingId) {
        Borrowing borrowing = getBorrowing(borrowingId);
        if (borrowing == null) {
            throw new IllegalArgumentException("Borrowing not found: " + borrowingId);
        }
        if (borrowing.isReturned()) {
            throw new IllegalStateException("Book already returned for borrowing: " + borrowingId);
        }
        borrowing.getBook().returnBook();
        borrowing.setReturned(true);
        notifyObservers(new LibraryEvent(LibraryEvent.Type.BOOK_RETURNED, borrowing.getBook()));
    }

    @Override
    public void reserveBook(String subscriberId, String bookId) {
        Subscriber subscriber = subscriberService.findById(subscriberId);
        if (subscriber == null) {
            throw new IllegalArgumentException("Subscriber not found: " + subscriberId);
        }
        Book book = bookService.getBookById(bookId);
        if (book == null) {
            throw new IllegalArgumentException("Book not found: " + bookId);
        }
        Reservation reservation = new Reservation(
                UUID.randomUUID().toString(),
                subscriber,
                book,
                LocalDate.now()
        );
        // Reservations are stored internally; expose via getReservations() if needed
        reservations.add(reservation);
        registerObserver(reservation);
    }

    @Override
    public Borrowing getBorrowing(String id) {
        return borrowings.stream()
                .filter(b -> b.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Borrowing> getAllBorrowings() {
        return List.copyOf(borrowings);
    }

    // Internal reservation list
    private List<Reservation> reservations = new ArrayList<>();

    public List<Reservation> getAllReservations() {
        return List.copyOf(reservations);
    }
}
