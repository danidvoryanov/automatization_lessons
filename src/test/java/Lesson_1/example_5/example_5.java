package Lesson_1.example_5;


public class example_5 {

    boolean or1(boolean a, boolean b) {
        return !(a || b);
    }

    boolean and1(boolean a, boolean b) {
        return !a && !b;
    }


    public static void main(String[] args) {
        example_5 comparison = new example_5();

        System.out.println(comparison.or1(false, false));
        System.out.println(comparison.and1(false, false));

        System.out.println(comparison.or1(false, true));
        System.out.println(comparison.and1(false, true));

        System.out.println(comparison.or1(true, false));
        System.out.println(comparison.and1(true, false));

        System.out.println(comparison.or1(true, true));
        System.out.println(comparison.and1(true, true));
    }
}


