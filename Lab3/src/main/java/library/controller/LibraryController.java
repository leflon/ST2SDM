package library.controller;

import library.model.Borrowing;
import library.service.IBorrowingService;
import library.service.IBookService;
import library.service.IPenaltyService;
import library.service.ISubscriberService;

public class LibraryController {
    private IBookService bookService;
    private ISubscriberService subscriberService;
    private IBorrowingService borrowingService;
    private IPenaltyService penaltyService;

    public LibraryController(IBookService bookService,
                              ISubscriberService subscriberService,
                              IBorrowingService borrowingService,
                              IPenaltyService penaltyService) {
        this.bookService = bookService;
        this.subscriberService = subscriberService;
        this.borrowingService = borrowingService;
        this.penaltyService = penaltyService;
    }

    public void borrowBook(String subscriberId, String bookId) {
        borrowingService.borrowBook(subscriberId, bookId);
    }

    public double calculatePenalty(String borrowingId) {
        Borrowing borrowing = borrowingService.getBorrowing(borrowingId);
        if (borrowing == null) {
            throw new IllegalArgumentException("Borrowing not found: " + borrowingId);
        }
        return penaltyService.calculatePenalty(borrowing);
    }

    public IBookService getBookService() { return bookService; }
    public ISubscriberService getSubscriberService() { return subscriberService; }
    public IBorrowingService getBorrowingService() { return borrowingService; }
    public IPenaltyService getPenaltyService() { return penaltyService; }
}
