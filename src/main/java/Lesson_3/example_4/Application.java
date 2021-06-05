package Lesson_3.example_4;

public class Application {
    public static void main(String[] args) {

        Human Sergey = new Human("Сергей");
        Human Mikhail = new Human("Михаил");
        Human Alexandr = new Human("Александр");
        Human Egor = new Human("Егор");
        Human Grigoriy = new Human("Григорий");
        Human Stanislav = new Human("Станислав");
        Human Valeriy = new Human("Валерий");

        Sergey.addToFriends(Valeriy);
        Sergey.addToFriends(Grigoriy);

        Valeriy.addToFriends(Sergey);
        Valeriy.addToFriends(Stanislav);

        Mikhail.addToFriends(Stanislav);
        Mikhail.addToFriends(Alexandr);

        Stanislav.addToFriends(Mikhail);
        Stanislav.addToFriends(Valeriy);

        Egor.addToFriends(Alexandr);
        Egor.addToFriends(Grigoriy);

        Alexandr.addToFriends(Mikhail);
        Alexandr.addToFriends(Egor);
        Alexandr.addToFriends(Grigoriy);

        Grigoriy.addToFriends(Alexandr);
        Grigoriy.addToFriends(Sergey);
        Grigoriy.addToFriends(Egor);

        System.out.println(isFriends(Sergey, Grigoriy));
        System.out.println(isFriends(Sergey, Alexandr));
        System.out.println(isFriends(Stanislav, Mikhail));
        System.out.println(isFriends(Mikhail, Valeriy));
    }

    public static boolean isFriends(Human human1, Human human2) {
        String firstName = human1.name;
        for (int i = 0; i < human2.socialMediaFriend.length; i++) {
            String secondName = human2.socialMediaFriend[i].name;
            if (secondName.equals(firstName)) {
                return true;
            }
        }
        return false;
    }
}
