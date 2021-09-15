package Lesson_7.example_3;

import java.util.ArrayList;

public class AnnuityCredit extends BaseCredit{
    public AnnuityCredit(double amount, double rate, int duration) {
        super(amount, rate, duration);
    }

    @Override
    public ArrayList<Double> getMonthPayments() {
        return super.getMonthPayments();
    }
}
