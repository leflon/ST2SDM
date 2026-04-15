package com.library;

public class DigitalBook extends Book {
    private int maxConcurrentLicenses;
    private int activeLicenses;

    @Override
    public boolean isAvailable() {
        return activeLicenses < maxConcurrentLicenses;
    }
}
