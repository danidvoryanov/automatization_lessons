package Lesson_2.example_8;

public class SwitchA {
    static String switcha(int n) {
        switch (n) {
            case 1:
                return "A";
            case 2:
                return "AA";
            case 3:
                return "AAA";
            case 4:
                return "AAAA";
            default:
                return "AAAAA";
        }
    }

    static void switchbreak(int n) {
        switch (n) {
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("AA");
                break;
            case 3:
                System.out.println("AAA");
                break;
            case 4:
                System.out.println("AAAA");
                break;
            default:
                System.out.println("AAAAA");
        }
    }

    public static void main(String[] args) {
        System.out.println(switcha(-1));
        System.out.println(switcha(2));
        System.out.println(switcha(4));
        System.out.println(switcha(7));
        System.out.println(switcha(0));
        switchbreak(-1);
        switchbreak(2);
        switchbreak(4);
        switchbreak(7);
        switchbreak(-1);
    }
}
