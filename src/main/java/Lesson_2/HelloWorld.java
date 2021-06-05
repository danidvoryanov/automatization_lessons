package Lesson_2;

import java.lang.reflect.Array;
import java.util.Arrays;

class HelloWorld {
    static String simile(String first, String second) {
        String line = "";

        char sorting[] = first.toCharArray();
        Arrays.sort(sorting);

        for (char item : sorting) {
            String itemChar = String.valueOf(item);
            if (line.contains(itemChar)) continue;
            if (second.contains(itemChar)) line += itemChar;
        }

        return line;
    }


    public static void main(String[] args) {
        HelloWorld simile = new HelloWorld ();
        System.out.println(HelloWorld.simile("hello", "world"));
        System.out.println(HelloWorld.simile("ping", "pong"));
        System.out.println(HelloWorld.simile("qwer", "asdf"));
        System.out.println(HelloWorld.simile("post", "get"));
    }
}


