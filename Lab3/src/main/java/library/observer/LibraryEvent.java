package library.observer;

import library.model.Book;

public class LibraryEvent {

    public enum Type {
        BOOK_BORROWED,
        BOOK_RETURNED,
        BOOK_RESERVED
    }

    private final Type type;
    private final Book book;

    public LibraryEvent(Type type, Book book) {
        this.type = type;
        this.book = book;
    }

    public Type getType() { return type; }
    public Book getBook() { return book; }
}
