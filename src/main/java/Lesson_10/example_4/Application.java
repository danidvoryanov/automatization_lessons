package Lesson_10.example_4;

import Lesson_10.example_4.model.CashDocument;
import Lesson_10.example_4.model.SalaryDocument;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        new SalaryDocument().generate().save();
        new CashDocument().generate().save();
    }

}
