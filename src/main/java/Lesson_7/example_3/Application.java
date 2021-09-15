package Lesson_7.example_3;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        double amount = 30000d;
        double rate = 16.9d;
        int duration = 12;
        BaseCredit zeroPercent = new BaseCredit(amount, rate, duration);
        BaseCredit differentiate = new DifferentiateCredit(amount, rate, duration);
        BaseCredit annuity = new AnnuityCredit(amount, rate, duration);

        List<Double> zeroPayments = zeroPercent.getMonthPayments();
        List<Double> diffPayments = differentiate.getMonthPayments();
        List<Double> annuityPayments = annuity.getMonthPayments();

        for (int i = 0; i < zeroPayments.size(); i++) {
            System.out.printf("%d: %.2f   %.2f   %.2f%n", i + 1, zeroPayments.get(i), diffPayments.get(i), annuityPayments.get(i));
        }

        System.out.printf("Переплата по каждому кредиту:%n %.2f  %.2f  %.2f",
                zeroPercent.calculateOverpayment(), differentiate.calculateOverpayment(), annuity.calculateOverpayment());

    }
}
