package com.library;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    private String id;
    private String name;
    private List<Book> books;

    public Collection(String id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void addBook(Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
        }
    }

    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId() != null && book.getId().equals(bookId));
    }
}
