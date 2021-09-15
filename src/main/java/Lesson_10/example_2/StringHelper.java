package Lesson_10.example_2;

import java.util.Random;

public class StringHelper {

    public static String generate() {

        int minLength = Config.LINES_MIN_LENGTH;
        int maxLength = Config.LINES_MAX_LENGTH;
        int length = new Random().nextInt(maxLength - minLength) + minLength;

        String pattern = Config.LINES_PATTERN;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = new Random().nextInt(pattern.length() - 1) + 1;
            char str = pattern.charAt(index);
            stringBuilder.append(str);
        }

        return stringBuilder.toString();
    }
}
