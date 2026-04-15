package com.library;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class LibraryManager {
    private Map<String, Book> books = new HashMap<>();
    private Map<String, Subscriber> subscribers = new HashMap<>();
    private Map<String, Collection> collections = new HashMap<>();

    public void addBook(Book book) {
        if (book != null && book.getId() != null) {
            books.put(book.getId(), book);
        }
    }

    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    public void updateBook(String bookId, Book updatedBook) {
        if (books.containsKey(bookId) && updatedBook != null) {
            books.put(bookId, updatedBook);
        }
    }

    public Book findBook(String bookId) {
        return books.get(bookId);
    }

    public void addSubscriber(Subscriber subscriber) {
        if (subscriber != null && subscriber.getId() != null) {
            subscribers.put(subscriber.getId(), subscriber);
        }
    }

    public void removeSubscriber(String subscriberId) {
        subscribers.remove(subscriberId);
    }

    public void updateSubscriber(String subscriberId, Subscriber updatedSubscriber) {
        if (subscribers.containsKey(subscriberId) && updatedSubscriber != null) {
            subscribers.put(subscriberId, updatedSubscriber);
        }
    }

    public Subscriber findSubscriber(String subscriberId) {
        return subscribers.get(subscriberId);
    }

    public void addCollection(String name) {
        String id = UUID.randomUUID().toString();
        Collection newCollection = new Collection(id, name);
        collections.put(id, newCollection);
    }

    public void removeCollection(String id) {
        collections.remove(id);
    }
}
