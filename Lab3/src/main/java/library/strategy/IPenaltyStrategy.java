package library.strategy;

import library.model.Borrowing;

public interface IPenaltyStrategy {
    double calculate(Borrowing borrowing, long daysOverdue);
}
