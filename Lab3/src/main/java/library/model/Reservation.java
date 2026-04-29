package library.model;

import library.observer.LibraryEvent;
import library.observer.LibraryEventListener;

import java.time.LocalDate;

public class Reservation implements LibraryEventListener {
    private String id;
    private Subscriber subscriber;
    private Book book;
    private LocalDate reservationDate;

    public Reservation(String id, Subscriber subscriber, Book book, LocalDate reservationDate) {
        this.id = id;
        this.subscriber = subscriber;
        this.book = book;
        this.reservationDate = reservationDate;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Subscriber getSubscriber() { return subscriber; }
    public void setSubscriber(Subscriber subscriber) { this.subscriber = subscriber; }
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
    public LocalDate getReservationDate() { return reservationDate; }
    public void setReservationDate(LocalDate reservationDate) { this.reservationDate = reservationDate; }

    @Override
    public void update(LibraryEvent event) {
        if (event.getType() == LibraryEvent.Type.BOOK_RETURNED
                && event.getBook().equals(this.book)) {
            System.out.println("[Reservation] Book '" + book.getTitle()
                    + "' is now available for subscriber '" + subscriber.getName() + "'");
        }
    }

    @Override
    public String toString() {
        return "Reservation{id='" + id + "', subscriber=" + subscriber.getName()
                + ", book=" + book.getTitle() + ", date=" + reservationDate + "}";
    }
}
