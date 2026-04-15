package com.library;

import java.util.Date;

public class Reservation {
    private String id;
    private Date createdAt;
    private Date notifiedAt;
    private Date expiresAt;
    private ReservationStatus status;
    private Subscriber requestedBy;
    private Book forBook;

    public void notify(Date now) {
        // stub
    }

    public boolean claim(Date now) {
        // stub
        return false;
    }

    public boolean expire(Date now) {
        // stub
        return false;
    }

    public void cancel() {
        // stub
    }
}
