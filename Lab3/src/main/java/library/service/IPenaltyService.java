package library.service;

import library.model.Borrowing;

public interface IPenaltyService {
    double calculatePenalty(Borrowing borrowing);
}
