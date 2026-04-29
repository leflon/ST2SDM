package library.strategy;

import library.model.Borrowing;

public class FlatRatePenaltyStrategy implements IPenaltyStrategy {

    private final double dailyRate;

    public FlatRatePenaltyStrategy(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculate(Borrowing borrowing, long daysOverdue) {
        return daysOverdue * dailyRate;
    }
}
