package com.library;

public class PhysicalBook extends Book {
    private int totalCopies;
    private int availableCopies;

    @Override
    public boolean isAvailable() {
        return availableCopies > 0;
    }
}
