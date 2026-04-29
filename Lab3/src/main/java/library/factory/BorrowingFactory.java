package library.factory;

import library.model.Book;
import library.model.Borrowing;
import library.model.Subscriber;

import java.time.LocalDate;
import java.util.UUID;

public class BorrowingFactory {

    /**
     * Loan durations (in days) by subscriber role.
     * Restricted-access books always use the shortest duration regardless of role.
     */
    private static final int LOAN_DAYS_TEACHER  = 30;
    private static final int LOAN_DAYS_STUDENT  = 14;
    private static final int LOAN_DAYS_EXTERNAL =  7;
    private static final int LOAN_DAYS_RESTRICTED = 7;

    public Borrowing createBorrowing(Subscriber subscriber, Book book) {
        LocalDate borrowDate = LocalDate.now();
        LocalDate dueDate    = borrowDate.plusDays(resolveLoanDays(subscriber, book));

        return new Borrowing(
                UUID.randomUUID().toString(),
                subscriber,
                book,
                borrowDate,
                dueDate,
                false
        );
    }

    private int resolveLoanDays(Subscriber subscriber, Book book) {
        if (book.isRestrictedAccess()) {
            return LOAN_DAYS_RESTRICTED;
        }
        return switch (subscriber.getRole()) {
            case TEACHER  -> LOAN_DAYS_TEACHER;
            case STUDENT  -> LOAN_DAYS_STUDENT;
            case EXTERNAL -> LOAN_DAYS_EXTERNAL;
        };
    }
}
