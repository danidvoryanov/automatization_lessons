package Lesson_3.example_1;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.summ(4, 2));
        System.out.println(calculator.substract(5, 3));
        System.out.println(calculator.multiply(2, 6));
        System.out.println(calculator.divide(5, 3));
    }
}
