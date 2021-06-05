package Lesson_2;

public class whattypeofage {
    private static String whattypeofage(int age) {
        if (age >= 25 && age < 44) return "Молодой возраст";
        if (age >= 44 && age < 60) return "Средний возраст";
        if (age >= 60 && age < 75) return "Пожилой возраст";
        if (age >= 75 && age < 90) return "Старческий возраст";
        return "Неизвестный возраст";
    }

    public static void main(String[] args) {
        System.out.println(whattypeofage(32));
        System.out.println(whattypeofage(52));
        System.out.println(whattypeofage(66));
        System.out.println(whattypeofage(82));
        System.out.println(whattypeofage(25));
        System.out.println(whattypeofage(44));
        System.out.println(whattypeofage(60));
        System.out.println(whattypeofage(75));
        System.out.println(whattypeofage(22));
        System.out.println(whattypeofage(119));
    }
}
