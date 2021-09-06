package Lesson_6.example_2.generators;

import Lesson_6.example_2.Human;
import Lesson_6.example_2.Chance;
import Lesson_6.example_2.PhoneType;

import java.util.HashMap;
import java.util.Map;


public class HumanGenerator {

    public static Human generate() {
        String lastName = NameGenerator.generate();
        String firstName = NameGenerator.generate();
        int age = AgeGenerator.generate();
        Map<PhoneType, String> phones = new HashMap<>();

        for (int i = 0; i < PhoneType.values().length; i++) {
            if (Chance.calculateChance(20)) {
                PhoneType phoneType = PhoneType.values()[i];
                phones.put(phoneType, PhoneGenerator.generate());
            }
        }

        return new Human(lastName, firstName, age, phones);
    }
}

