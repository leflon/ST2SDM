package com.library;

import java.util.Date;
import java.util.List;

public abstract class Book {
    protected String id;
    protected String isbn;
    protected String title;
    protected Date publicationYear;
    protected String language;
    protected String category;
    protected float value;
    protected List<Role> restrictedToRoles;
    protected List<Author> authors;
    protected List<Subscriber> notifiedSubscribers;
    protected List<Reservation> reservations;

    public String getId() {
        return id;
    }

    public void subscribeToAvailabilityNotifications(Subscriber subscriber) {
        // stub
    }

    public void unsubscribeFromAvailabilityNotifications(Subscriber subscriber) {
        // stub
    }

    public Reservation addReservation(Subscriber subscriber, Date now) {
        // stub
        return null;
    }

    public boolean hasWaitingReservations() {
        // stub
        return false;
    }

    public boolean isReservedBy(Subscriber subscriber) {
        // stub
        return false;
    }

    public Reservation notifyNextReservation(Date now) {
        // stub
        return null;
    }

    public void expireOverdueReservations(Date now) {
        // stub
    }

    public abstract boolean isAvailable();
}
