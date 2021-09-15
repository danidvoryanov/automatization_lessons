package Lesson_11.example_2;

public class Human {

    private String firstName;
    private int age;

    public String getFirstName() {
        return firstName;

    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        if (!firstName.matches("^[А-ЯЁ]?[а-яё]{2,11}$")) {
            throw new IllegalArgumentException("Некорректное имя: " + firstName);
        }
        this.firstName = firstName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Некорректный возраст: " + age);
        }
        this.age = age;
    }

}
