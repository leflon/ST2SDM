package library.service;

import library.model.Borrowing;
import library.strategy.IPenaltyStrategy;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PenaltyService implements IPenaltyService {

    private final IPenaltyStrategy strategy;

    public PenaltyService(IPenaltyStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double calculatePenalty(Borrowing b) {
        if (b == null) {
            throw new IllegalArgumentException("Borrowing must not be null");
        }
        if (b.isReturned()) {
            return 0.0;
        }
        LocalDate today = LocalDate.now();
        if (!today.isAfter(b.getDueDate())) {
            return 0.0;
        }
        long daysOverdue = ChronoUnit.DAYS.between(b.getDueDate(), today);
        return strategy.calculate(b, daysOverdue);
    }
}
