package Lesson_6.example_2;

import java.util.Map;

public class Human {
    private String lastName;
    private String firstName;
    private int age;
    Map<PhoneType, String> phones;

    public Human(String lastName, String firstName, int age, Map<PhoneType, String> phones) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.phones = phones;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Map<PhoneType, String> getPhones() {
        return phones;
    }
}
