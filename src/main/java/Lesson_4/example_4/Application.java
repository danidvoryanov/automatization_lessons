package Lesson_4.example_4;

public class Application {
        public static void main(String[] args) {

            Passport correct = new Passport().setSeries("2342").setNumber("132414");
            Passport duplicate = new Passport().setSeries("134").setNumber("143456");
            Passport incorrect = new Passport().setSeries("123").setNumber("42342324234234");
            Passport incorrect2 = new Passport().setSeries("^^^").setNumber("wefwef");
            Passport incorrect3 = new Passport().setSeries("12344").setNumber("wqdewd");
            Passport incorrect4 = new Passport().setSeries("").setNumber("wqdewd");

            Passport nullPassport = new Passport();
            System.out.printf("Passport is null: %s %s%n", nullPassport.getSeries(), nullPassport.getNumber());

            Passport seriesPassport = new Passport().setSeries("4321");
            Passport numberPassport = new Passport().setNumber("654321");

            Human human = new Human().setAge(28).setFirstName("Дворянов").setLastName("Даниэль").setPassport(correct);
            Human human2 = new Human().setAge(25).setFirstName("Петр").setLastName("Петров").setPassport(duplicate);

            human.setPassport(numberPassport).setPassport(seriesPassport);
            human2.setPassport(numberPassport).setPassport(seriesPassport);


        }
    }

