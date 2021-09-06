package Lesson_4.example_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {
        Human human = new Human();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        human.setLastName("Анна");
        human.setFirstName("Каренина");
        human.setBirthDate(dateFormat.parse("1987-01-06"));
        human.setLastName("Безухов");
        human.setFirstName("Пьер");
        human.setBirthDate(dateFormat.parse("1785-05-15"));
        human.setLastName("РРРР");
        human.setFirstName("???");
        human.setBirthDate(dateFormat.parse("2111-04-15"));
        human.setLastName("4321312");
        human.setFirstName("243424234");
        human.setBirthDate(dateFormat.parse("а025-04-15"));
    }
}

