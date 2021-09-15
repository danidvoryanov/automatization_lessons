package Lesson_11.example_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Agetest {
    @Test
    public void ageTest(){
        Human human = new Human();
        human.setAge(20);
        Assertions.assertEquals(human.getAge(), 20);
    }
}
