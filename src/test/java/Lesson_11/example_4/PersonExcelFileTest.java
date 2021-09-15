import Lesson_11.example_4.Passport;
import Lesson_11.example_4.Person;
import Lesson_11.example_4.FileHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class PersonExcelFileTest {

    @Test
    @DisplayName("Получение людей с первой страницы Excel файла")
    public void getPersonsFromSheetOfExcelFileTest() {
        String fileLocation = "src/main/java/Lesson_11/example_4/persons.xlsx";
        List<Person> persons = FileHelper.getPersonsFromExcel(fileLocation, "Persons1");

        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", getDateFromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", getDateFromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", getDateFromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Михайлов", "Константин", "Игоревич", getDateFromString("18.05.1972"), new Passport("4500", "535344")),
                new Person("Александрова", "Мария", "Сергеевна", getDateFromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", getDateFromString("17.07.1978"), new Passport("4504", "532212"))
        );

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expectedPersons.size(), persons.size());

        for (int i = 0; i < persons.size(); i++) {
            Assertions.assertEquals(expectedPersons.get(i), persons.get(i));
        }
    }

    @Test
    @DisplayName("Получение людей со второй страницы Excel файла")
    public void getPersonsFromSheetTwoOfExcelFileTest() {
        String fileLocation = "src/main/java/Lesson_11/example_4/persons.xlsx";
        List<Person> persons = FileHelper.getPersonsFromExcel(fileLocation, "Persons2");

        List<Person> expectedPersons = Arrays.asList(
                new Person("Иванов", "Владимир", "Михайлович", getDateFromString("14.01.1990"), new Passport("4510", "155442")),
                new Person("Петров", "Михаил", "Валерьевич", getDateFromString("12.06.1984"), new Passport("4511", "523533")),
                new Person("Васильев", "Валерий", "Александрович", getDateFromString("17.12.1991"), new Passport("4512", "325235")),
                new Person("Михайлов", "Константин", "Игоревич", getDateFromString("18.05.1972"), new Passport("4500", "535344")),
                new Person("Александрова", "Мария", "Сергеевна", getDateFromString("19.11.1985"), new Passport("4502", "154333")),
                new Person("Кузнецов", "Сергей", "Николаевич", getDateFromString("17.07.1978"), new Passport("4504", "532212"))
        );

        Assertions.assertNotNull(persons);
        Assertions.assertEquals(expectedPersons.size(), persons.size());

        for (int i = 0; i < persons.size(); i++) {
            Assertions.assertEquals(expectedPersons.get(i), persons.get(i));
        }
    }

    @Test
    @DisplayName("Получение людей из несуществующего листа")
    public void getPersonsFromUnknownSheetOfExcelFileTest() {
        String fileLocation = "src/main/java/Lesson_11/example_4/persons.xlsx";
        List<Person> persons = FileHelper.getPersonsFromExcel(fileLocation, "PersonsN/A");
        Assertions.assertNull(persons);
    }

    @Test
    @DisplayName("Получение людей из несуществующего документа")
    public void getPersonsFromSheetOfUnknownExcelFileTest() {
        String fileLocation = "src/main/java/Lesson_11/example_4/personsN/A.xlsx";
        List<Person> persons = FileHelper.getPersonsFromExcel(fileLocation, "Persons1");
        Assertions.assertNull(persons);
    }

    private Date getDateFromString(String dateFormat) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(dateFormat);
        } catch (ParseException e) {
            throw new RuntimeException();
        }
    }
}