package Lesson_3.example_5;

import java.util.Random;

public class Name {
    static final String[] nameofhuman = {"Андрей", "Петр", "Алина", "Арина", "Елена"};
    static final String[] nameofcat = {"Гав", "Матроскин","Том","Леопольд","В сапогах"};
    static final String[] nameofdog = {"Бим", "Рекс", "Белка","Стрелка"};

    public static String getCatName() {
        Random random = new Random();
        return nameofcat[random.nextInt(nameofcat.length)];
    }

    public static String getDogName() {
        Random random = new Random();
        return nameofdog[random.nextInt(nameofdog.length)];
    }

    public static String getHumanName() {
        Random random = new Random();
        return nameofhuman[random.nextInt(nameofhuman.length)];
    }
}

