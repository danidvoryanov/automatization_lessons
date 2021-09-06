package Lesson_5.example_2;

public class Application {
    public static void main(String[] args) {

        Cat cat0 = new Cat("Барсик", 1);
        Cat cat1 = new Cat("Мурзик", 2);
        Cat cat3 = new Cat("Леопольд", 3);
        Cat cat4 = new Cat("Базилио", 4);
        Cat[] cats = {cat0, cat1, null, cat3, cat4};
        for (
                Cat listCats : cats) {
            try {
                System.out.printf("Имя: %s, Возраст: %d%n", listCats.getName(), listCats.getAge());
            } catch (NullPointerException e) {
                System.out.println("NULL");
                break;
            }
        }
    }
}