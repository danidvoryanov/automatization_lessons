package Lesson_10.example_4.helpers;

import java.util.Random;

public class StringGenerator {

    public static  String generate(int length, String pattern) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append(pattern.charAt(new Random().nextInt(pattern.length())));
        }
        return stringBuilder.toString();
    }
}
