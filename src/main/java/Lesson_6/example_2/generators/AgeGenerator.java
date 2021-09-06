package Lesson_6.example_2.generators;

import java.util.Random;

public class AgeGenerator {
    public static int generate() {
        return 20 + new Random().nextInt(55);
    }
}