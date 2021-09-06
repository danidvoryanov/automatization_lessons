package Lesson_4.example_1;

import java.util.Date;
import java.util.regex.Pattern;

public class Human {
    private String last_Name;
    private String first_Name;
    private Date birthDate;


    public void setBirthDate(Date birthDate) {
        getPrint("даты", birthDate.toString());
        Date today = new Date(System.currentTimeMillis());
        if (birthDate.before(today)){
            this.birthDate = birthDate;
            setCorrectPrint("даты", birthDate.toString());
        }
        else
            setIncorrectPrint(birthDate.toString());
    }

    public String getFirstName() {
        return first_Name;
    }

    public void setFirstName(String firstName) {
        getPrint("имени", firstName);
        if (Pattern.matches("^[А-Я][а-я]{2,}$", firstName)){
            this.first_Name = firstName;
            setCorrectPrint("имени", firstName);
        }
        else
            setIncorrectPrint(firstName);
    }

    private void getPrint(String variable, String variableValue) {
        System.out.println("Получено значение "+ variable + ": " + variableValue);
    }

    private void setIncorrectPrint(String incorrectValue) {
        System.out.println("Введенное значение не корректно: " + incorrectValue);
    }

    public String getLastName() {
        return last_Name;
    }

    public void setLastName(String lastName) {
        getPrint("фамилии", lastName);
        if (Pattern.matches("^[А-Я][а-я]{2,}$", lastName)) {
            this.last_Name = lastName;
            setCorrectPrint("фамилиии", lastName);
        } else
            setIncorrectPrint(lastName);
    }

    private void setCorrectPrint(String variable, String correctValue) {
        System.out.println("Установлено корректное значение "+ variable + ": " + correctValue);
    }
}