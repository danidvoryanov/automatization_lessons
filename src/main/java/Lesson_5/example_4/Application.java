package Lesson_5.example_4;

import java.util.Random;

public class Application { public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        for (int i = 0; i < cats.length; ) {
            try {
                cats[i] = new Cat(new Random().nextInt(100) - 50, "Созданный кот");
            } catch (AgeTooHighException e) {
                cats[i] = null;
                System.out.println("Большой возраст для кота");
            } finally {
                i++;
            }

            for (Cat cat : cats) {
                try {
                    System.out.printf("Имя: %s, Возраст: %d%n", cat.getName(), cat.getAge());
                } catch (NullPointerException e) {
                    System.out.println("Ошибка вывода данных");
                }
            }
        }
    }
}
