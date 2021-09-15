package Lesson_11.example_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {

    @Test
    @DisplayName("Проверка метода калькулятора: суммирование n чисел")
    public void sumTest() {
        Assertions.assertEquals(10, Calculator.calculateAll(1, 2, 3, 4));
        Assertions.assertEquals(8, Calculator.calculateAll(5, 3));
    }
}
