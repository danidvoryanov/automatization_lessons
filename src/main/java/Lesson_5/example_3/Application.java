package Lesson_5.example_3;

import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int total = new Random().nextInt(500) + 500;
        int exceptionCount = 0;

        for (int i = 0; i < total; i++) {
            try {
                int m = new Random().nextInt(4);
                int n = new Random().nextInt(4);
                int result = m / n;
            } catch (ArithmeticException e) {
                exceptionCount++;
            }

        }
        System.out.printf("Из %d операций деления, %d было выполнено с ошибкой", total, exceptionCount);
    }
}
