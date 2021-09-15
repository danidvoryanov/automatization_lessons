package Lesson_9.example_1;

import Lesson_9.example_1.Cars.*;
import java.util.Random;

public class Factory {
    public static Car make() {
        int random = new Random().nextInt(101);
        if (random >= 0 && random < 40) return new Renualt();
        else if (random >= 40 && random < 70) return new Nissan();
        else if (random >= 70 && random < 90) return new Mitsubishi();
        else if (random >= 90) return new Mercedes();
        throw new IllegalStateException();


    }
}
