package Lesson_8.example_2;

import java.util.HashSet;
import java.util.Set;

public class Application {
    private final static int ITERATIONS_COUNT = 100_000;
    private final static int GROUP_AMOUNT_FROM = 10;
    private final static int GROUP_AMOUNT_TO = 30;

    public static void main(String[] args) {
        for (int personAmount = GROUP_AMOUNT_FROM; personAmount <= GROUP_AMOUNT_TO; personAmount++) {
            int hasDuplicates = 0;
            for (int i = 0; i < ITERATIONS_COUNT; i++) {
                Set<Person> persons = new HashSet<>();
                for (int j = 0; j < personAmount; j++) {
                    persons.add(new Person());
                }

                if (persons.size() != personAmount) hasDuplicates++;
            }

            double duplicateChance = (100.0f * hasDuplicates) / ITERATIONS_COUNT;
            System.out.printf("%d: %.2f %%%n", personAmount, duplicateChance);

        }
    }
}
