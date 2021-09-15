package Lesson_9.example_4;

import Lesson_9.example_4.Food.Food;

import java.util.List;

public class RoundRobinDistributor extends Distributor {
    private static int pointer = -1;

    @Override
    public Cooker chooseCooker(List<Cooker> cookers) {
        pointer++;
        return cookers.get(pointer %= cookers.size());
    }

    @Override
    void addFood(Food food, List<Cooker> cookers) {
        chooseCooker(cookers).addFood(food);
    }
}
