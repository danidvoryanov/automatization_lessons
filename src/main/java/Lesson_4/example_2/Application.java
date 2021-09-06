package Lesson_4.example_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

public class Application {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public static void main(String[] args) throws IOException, ParseException {
        Human[] humans = new Human[]{new Human(), new Human(), new Human()};
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //Вариант 1.
        System.out.println("Введите Фамилию, Имя и дату рождения в формате [%s %s %s]:");
        do {
            for (int i = 0; i < 3; i++) {
                String inputLine;
                do {
                    inputLine = reader.readLine();
                    if (Validator.validateStringForSpaces(inputLine)) {
                        String[] lines = Validator.stringToArray(inputLine);
                        humans[i].setLastName(lines[0])
                                .setFirstName(lines[1])
                                .setBirthDate(simpleDateFormat.parse(lines[2]));
                    }
                } while (!Validator.validateHuman(humans[i]));
            }
        } while (Validator.validateHumanArray(humans));
        reader.close();
    }
}
