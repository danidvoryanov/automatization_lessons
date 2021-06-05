package Lesson_3.example_5;

import java.util.Random;

public class Dog {
    String name;
    int age;

    public Dog() {
        Random random = new Random();
        this.name = Lesson_3.example_5.Name.getDogName();
        age = random.nextInt(10);
    }
}
