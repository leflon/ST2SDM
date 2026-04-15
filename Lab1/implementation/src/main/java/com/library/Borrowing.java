package com.library;

import java.util.Date;

public class Borrowing {
    private String id;
    private Date startDate;
    private Date expectedReturnDate;
    private Date returnedAt;
    private int renewalCount;
    private Book book;
    private Subscriber subscriber;

    public void returnBook() {
        // stub
    }

    public boolean canRenew(boolean hasWaitingReservations) {
        // stub
        return false;
    }

    public boolean renew(int extraDays) {
        // stub
        return false;
    }

    public float computePenalty(PenaltyRules rules, float bookValue) {
        // stub
        return 0.0f;
    }
}
