package Lesson_6.example_2;

import java.util.Random;

public class Chance {

    public static boolean calculateChance(int percent) {
        return percent >= new Random().nextInt(100);
    }
}
