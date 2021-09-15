package Lesson_8.example_4;

import Lesson_8.example_4.entities.*;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Entity user = new User("Аркадий Паровозов", "Бухгалтер");
        user.validate();

        Entity user2 = new User("Максим Петр", "Тестировщик");
        user2.validate();
        Entity user3 = new User("Максим Иванов", "HR");
        user3.validate();
        Entity user4 = new User("Петр Иванов", "Продукт овнер");
        user4.validate();

        List<Entity> entities = Arrays.asList(
                new Account("Расчетный счет ФЛ", "40817810412345678901"),
                new Account("Расчетный счет ФЛ", "40817810412345678901"),
                new Account("Расчетный счет ФЛ-2", "40817810412345678901"),
                new Account("Расчетный счет ФЛ", "40817810400000000000"),

                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный офис", "г. Москва"),
                new Branch("Операционный филиал", "г. Москва"),
                new Branch("Операционный офис", "г. Саратов"),

                new Client("ООО Рога и копыта", "г. Москва, ул. Миклухо-Маклая, д. 41"),
                new Client("ООО Рога и копыта", "г. Москва, ул. Миклухо-Маклая, д. 41"),
                new Client("ООО Рога и копыта", "г. Москва, ул. Проходчиков, д. 3"),
                new Client("ООО Зеркало", "г. Москва, ул. Миклухо-Маклая, д. 41")
        );

        for (Entity entity : entities)
            entity.validate();
    }
}
