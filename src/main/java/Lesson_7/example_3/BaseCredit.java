package Lesson_7.example_3;

import java.util.ArrayList;

public class BaseCredit {
    private double amount;
    private double rate;
    private int duration;

    public double getAmount() {
        return amount;
    }

    public BaseCredit(double amount, double rate, int duration) {
        setAmount(amount);
        setRate(rate);
        setDuration(duration);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Double> getMonthPayments() {

        ArrayList<Double> paymentSchedule = new ArrayList<>();

        for (int i = 0; i < duration; i++) {
            paymentSchedule.add(amount / duration);
        }
        return paymentSchedule;
    }

    public double calculateOverpayment() {
        return 1.0;
    }
}
