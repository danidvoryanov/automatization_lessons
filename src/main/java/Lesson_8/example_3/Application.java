package Lesson_8.example_3;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Terminal> terminals = Arrays.asList(
                new QiwiTerminal("г. Москва, ул. Проходчиков, д.3"),
                new EleksnetTerminal("г. Москва, Измайловский пр-т, 73/2"),
                new EleksnetTerminal("г. Москва, ул. Бакунинская, д.1"),
                new EleksnetTerminal("г. Новосибирск, ул. Героев-Десантников, д. 4"),
                new TinkoffTerminal("г. Москва, Ленинградский пр-т, д. 15")
        );

        for (Terminal terminal : terminals) {
            terminal.pay("+7(900)000-0001", 50);
            terminal.pay("+7(900)000-0010", 150);
            terminal.pay("+7(900)000-0100", 300);
            terminal.pay("+7(900)000-1000", 450);
            terminal.pay("+7(900)001-0600", 600);
            terminal.pay("+7(900)010-0800", 800);
            terminal.pay("+7(900)100-1000", 1000);
            terminal.pay("+7(901)000-0000", 1500);
        }

    }
}
