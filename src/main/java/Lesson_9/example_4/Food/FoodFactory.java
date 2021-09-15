package Lesson_9.example_4.Food;

import java.util.Random;

public class FoodFactory {
    public static Food generate() {
        int chance = new Random().nextInt(6);
        switch (chance) {
            case 0:
                return new Buckwheat();
            case 1:
                return new Coffee();
            case 2:
                return new Fish();
            case 3:
                return new Meat();
            case 4:
                return new Rice();
            case 5:
                return new Tea();
        }
        throw new IllegalStateException();
    }
}
