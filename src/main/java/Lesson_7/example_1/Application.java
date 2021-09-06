package Lesson_7.example_1;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Integer> ints = new MyArrayList<>();
        ints.add(2);
        ints.add(8);
        ints.add(1,4 );
        ints.contains(4);
        ints.contains(21);
        ints.size();
        ints.get(-11);
    }
}
