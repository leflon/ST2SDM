package library.model;

import java.time.LocalDate;

public class Borrowing {
    private String id;
    private Subscriber subscriber;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private boolean returned;

    public Borrowing(String id, Subscriber subscriber, Book book,
                     LocalDate borrowDate, LocalDate dueDate, boolean returned) {
        this.id = id;
        this.subscriber = subscriber;
        this.book = book;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returned = returned;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Subscriber getSubscriber() { return subscriber; }
    public void setSubscriber(Subscriber subscriber) { this.subscriber = subscriber; }
    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }
    public LocalDate getBorrowDate() { return borrowDate; }
    public void setBorrowDate(LocalDate borrowDate) { this.borrowDate = borrowDate; }
    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
    public boolean isReturned() { return returned; }
    public void setReturned(boolean returned) { this.returned = returned; }

    @Override
    public String toString() {
        return "Borrowing{id='" + id + "', subscriber=" + subscriber.getName()
                + ", book=" + book.getTitle() + ", dueDate=" + dueDate + ", returned=" + returned + "}";
    }
}
