package Lesson_5.example_5;

import Lesson_5.example_5.exception.*;

public class Application {
    public static void main(String[] args) {
        createPassport("4132", "312412");
        createPassport("", "");
        createPassport("12-34", "567890");
        createPassport("12-34", "567890");
        createPassport(null, "123456");
        createPassport("12-34", null);
        createPassport(null, null);

    }

    public static Passport createPassport(String series, String number) {
        try {
            return new Passport(series, number);
        } catch (PassportSeriesArgumentException | PassportNumberArgumentException |
                PassportSeriesNullPointerException | PassportNumberNullPointerException exception){
            System.out.println("Введите верные значения серии и номера паспорта");
            return null;
        } catch (PassportAlreadyExistsException exception){
            System.out.println("Данные серия и номер паспорта уже существуют");
            return null;
        }
    }
}
