package Lesson_3.example_4;

import java.util.Arrays;

public class Human {
    String name;
    Human[] socialMediaFriend = new Human[0];
    public Human(String name) {
        this.name = name;
    }
    public void addToFriends(Human friend) {
        Human[] arrayFriends = Arrays.copyOf(socialMediaFriend, socialMediaFriend.length+1);
        if (arrayFriends[socialMediaFriend.length] == null) {
            arrayFriends[socialMediaFriend.length] = friend;
            socialMediaFriend = Arrays.copyOf(arrayFriends, arrayFriends.length);
        }
    }
}
