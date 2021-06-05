package Lesson_3.example_2;

import java.util.Arrays;

public class Cat {
    int age;
    int weight;
    String name;

    public Cat(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    public static void main(String[] args) {
        Cat[] newCat = {new Cat(2, 5, "Барсик"),
                new Cat(3, 11, "Мурзик"),
                new Cat(7, 2, "Матильда"),
                new Cat(1, 3, "Леопольд"),
                new Cat(11, 4, "Базилио")};

        String[] newCatsNames = new String[newCat.length];

        for (int i = 0; i < newCat.length; i++) {
            newCatsNames[i] = newCat[i].name;
        }

        Arrays.sort(newCatsNames);

        for (int i = 0; i < newCatsNames.length; i++) {
            for (int j = 0; j < newCat.length; j++) {
                if (newCat[j].name.equals(newCatsNames[i])) {
                    System.out.printf("Имя: %s, Возраст: %d. Вес: %d%n",
                            newCat[j].name,
                            newCat[j].age,
                            newCat[j].weight);
                }
            }
        }
    }
}
