package Lesson_6.example_1;

public class Human {
    private String lastname;
    private String firstname;
    private int age;
    private String phone;

    public Human(String lastname, String firstname, int age, String phone) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.age = age;
        this.phone = phone;
    }

    public String getLastName() {
        return lastname;
    }

    public String getFirstName() {
        return firstname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }
}
