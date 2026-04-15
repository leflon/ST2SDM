package com.library;

import java.util.Date;

public class Subscriber {
    private String id;
    private String name;
    private String email;
    private Role role;
    private boolean isSuspended;
    private int lateReturnsCount;
    private BorrowingConstraints borrowingConstraints;
    private ContactInformation contactInformation;

    public String getId() {
        return id;
    }

    public void notifyAvailability(Book book) {
        // stub
    }

    public boolean canBorrow(Book book) {
        // stub
        return false;
    }

    public Borrowing borrow(Book book, Date now, PenaltyRules rules) {
        // stub
        return null;
    }

    public float returnBook(Borrowing borrowing, Date now, PenaltyRules rules) {
        // stub
        return 0.0f;
    }

    public Reservation reserve(Book book, Date now) {
        // stub
        return null;
    }

    public void suspend() {
        this.isSuspended = true;
    }

    public void unsuspend() {
        this.isSuspended = false;
    }
}
