package Lesson_11.example_4;

import java.util.Date;
import java.util.Objects;

public class Person {
    private String firstName;
    private String secondName;
    private String patronymic;
    private Date birthDate;
    private Passport passport;

    public Person(String firstName, String secondName, String patronymic, Date birthDate, Passport passport) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.passport = passport;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDate = birthDay;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) && secondName.equals(person.secondName) && patronymic.equals(person.patronymic) && birthDate.equals(person.birthDate) && passport.equals(person.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, patronymic, birthDate, passport);
    }
}