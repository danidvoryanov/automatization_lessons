package Lesson_11.example_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstnameTest {
    @Test
    public void firstNameTest(){
        Human human = new Human();
        human.setFirstName("Иван");
        Assertions.assertEquals(human.getFirstName(), "Иван");
//        Assertions.assertEquals(human.getFirstName(), "Ив");
//        Assertions.assertEquals(human.getFirstName(), "Ивансдлиннымименем");
//        Assertions.assertEquals(human.getFirstName(), "Иван5аа");
    }
}
