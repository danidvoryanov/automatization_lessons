package Lesson_1.example_6;

public class example_6 {
    boolean circuit(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && !(c || d);
    }

    public static void main(String[] args) {
        example_6 curcuit1 = new example_6();

        System.out.println(curcuit1.circuit(false, false, false, false));
        System.out.println(curcuit1.circuit(true, true, true, true));
        System.out.println(curcuit1.circuit(true, false, true, false));
        System.out.println(curcuit1.circuit(true, true, false, false));
    }
}

