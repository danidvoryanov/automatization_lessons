package Lesson_3.example_5;

import java.util.Random;

public class Cat {
    String name;
    int age;

    public Cat() {
        Random random = new Random();
        this.name = Lesson_3.example_5.Name.getCatName();
        age = random.nextInt(10);
        }
}

