package library.strategy;

import library.model.Borrowing;

public class RoleBasedPenaltyStrategy implements IPenaltyStrategy {

    private final double teacherDailyRate;
    private final double studentDailyRate;
    private final double externalDailyRate;

    public RoleBasedPenaltyStrategy(double teacherDailyRate,
                                    double studentDailyRate,
                                    double externalDailyRate) {
        this.teacherDailyRate  = teacherDailyRate;
        this.studentDailyRate  = studentDailyRate;
        this.externalDailyRate = externalDailyRate;
    }

    @Override
    public double calculate(Borrowing borrowing, long daysOverdue) {
        double rate = switch (borrowing.getSubscriber().getRole()) {
            case TEACHER  -> teacherDailyRate;
            case STUDENT  -> studentDailyRate;
            case EXTERNAL -> externalDailyRate;
        };
        return daysOverdue * rate;
    }
}
