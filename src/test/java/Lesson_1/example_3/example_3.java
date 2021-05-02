package Lesson_1.example_3;

public class example_3 {


   boolean dividesByTwo(int n) {
        return (n % 2 == 0);
    }

    public static void main(String[] args) {
        example_3 n1 = new example_3();
        System.out.println(n1.dividesByTwo(14));
        System.out.println(n1.dividesByTwo(19));
    }
}