package library.service;

import library.model.Borrowing;

public interface IBorrowingService {
    void borrowBook(String subscriberId, String bookId);
    void returnBook(String borrowingId);
    void reserveBook(String subscriberId, String bookId);
    Borrowing getBorrowing(String id);
}
