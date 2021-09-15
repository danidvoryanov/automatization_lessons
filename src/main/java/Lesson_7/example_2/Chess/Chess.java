package Lesson_7.example_2.Chess;

import java.util.HashSet;
import java.util.Set;

public class Chess {

    public static Set<Position> allField() {
        Set<Position> fields = new HashSet<>();
        for (char i = 'A'; i <= 'H'; i++) {
            for (int j = 1; j <= 8; j++) {
                fields.add(new Position(String.valueOf(i) + j));
            }
        }
        return fields;
    }
}
