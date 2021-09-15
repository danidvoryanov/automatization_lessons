package Lesson_8.example_2;

import java.util.Random;

public class Person {
    private int birthDate;

    public Person() {
        birthDate = new Random().nextInt(365) + 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == getClass() || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthDate == person.birthDate;
    }

    @Override
    public int hashCode() {
        return birthDate;
    }

}
