package Lesson_10.example_4.model;

import Lesson_10.example_4.helpers.DoubleHelper;
import Lesson_10.example_4.helpers.Property;
import Lesson_10.example_4.helpers.StringGenerator;

import java.util.Random;

public class Employee implements Generatable {

    String lastName;
    String firstName;
    Passport passport;
    private Double salary;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Passport getPassport() {
        return passport;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public Object generate() {
        lastName = "LastName" + StringGenerator.generate(Property.EMPLOYEE_LASTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);
        firstName = "FirstName" + StringGenerator.generate(Property.EMPLOYEE_FIRSTNAME_LENGTH, Property.EMPLOYEE_NAME_PATTERN);

        passport = (Passport) new Passport().generate();

        salary = new Random().nextDouble() * (Property.EMPLOYEE_SALARY_MAX - Property.EMPLOYEE_SALARY_MIN) + Property.EMPLOYEE_SALARY_MIN;
        salary = DoubleHelper.round(salary);
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %s, %.2f", lastName, firstName, passport, salary);
    }
}
