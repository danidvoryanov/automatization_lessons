package Lesson_3.example_5;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Human[] arrayHuman = new Human[20];

        for (int i = 0; i < arrayHuman.length; i++) {
            arrayHuman[i] = new Human();
        }

        for (int i = 0; i < arrayHuman.length; i++) {

            int countCats = arrayHuman[i].cats.length;
            int countDogs = arrayHuman[i].dogs.length;

            for (int j = 0; j < arrayHuman.length; j++) {
                if (arrayHuman[i] != arrayHuman[j] && countCats == arrayHuman[j].cats.length && countDogs == arrayHuman[j].dogs.length) {
                    System.out.printf("%s количество кошек: %d количество собак: %d%n", arrayHuman[j].name, arrayHuman[j].cats.length, arrayHuman[j].dogs.length);
                }
            }
        }
    }
}
