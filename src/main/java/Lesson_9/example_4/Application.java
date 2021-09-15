package Lesson_9.example_4;

import Lesson_9.example_4.Food.Food;
import Lesson_9.example_4.Food.FoodFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        List<Cooker> cookers = new ArrayList<>();
        RoundRobinDistributor roundRobinDistributor = new RoundRobinDistributor();
        BusyTimeDistributor busyTimeDistributor = new BusyTimeDistributor();
        Random random = new Random();
        List<Food> order = new ArrayList<>(100);
        int maxCookingTimeRoundRobin = 0;
        int maxCookingTimeBusyTime = 0;

        for (int i = 0; i < random.nextInt(5) + 5; i++) {
            cookers.add(new Cooker());
        }
        for (int i = 0; i < 100; i++) {
            order.add(FoodFactory.generate());
        }
        for (Food food : order) {
            roundRobinDistributor.addFood(food, cookers);
        }
        for (Cooker cooker : cookers) {
            if (maxCookingTimeRoundRobin < cooker.getSummCookingTime()) {
                maxCookingTimeRoundRobin = cooker.getSummCookingTime();
            }
            cooker.clearOrder();
        }
        for (Food food : order) {
            busyTimeDistributor.addFood(food, cookers);
        }
        for (Cooker cooker : cookers) {
            if (maxCookingTimeBusyTime < cooker.getSummCookingTime()) {
                maxCookingTimeBusyTime = cooker.getSummCookingTime();
            }
            cooker.clearOrder();
        }
        System.out.println("Если в приготовлении 100 блюд задействованы " + cookers.size() + " поваров, то:");
        System.out.println("Время приготовления при распределении заказов по механизму RoundRobin, составит " + maxCookingTimeRoundRobin + " минут.");
        System.out.println("Время приготовления при распределении заказов по механизму BusyTime, составит " + maxCookingTimeBusyTime + " минут.");
    }
}
