package Lesson_9.example_4;

import Lesson_9.example_4.Food.Food;

import java.util.List;

abstract class Distributor implements CookChooser {
    abstract void addFood(Food food, List<Cooker> cookers);
}
