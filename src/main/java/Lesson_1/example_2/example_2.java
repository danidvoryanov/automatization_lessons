package Lesson_1.example_2;

public class example_2 {
    int weight;
    int hight;

    public static void main(String[] args) {
        example_2 getarea2 = new example_2();
        getarea2.weight = 2;
        getarea2.hight = 7;
        boolean a = getarea2.getarea() > getarea2.getperimetr() ? true : false;
        System.out.println(a);

        example_2 getarea3 = new example_2();
        getarea3.weight = 6;
        getarea3.hight = 5;
        boolean b = getarea3.getarea() > getarea3.getperimetr() ? true : false;
        System.out.println(b);

        example_2 getarea4 = new example_2();
        getarea4.weight = 6;
        getarea4.hight = 3;
        boolean c = getarea4.getarea() > getarea4.getperimetr() ? true : false;
        System.out.println(c);

    }

    int getperimetr() {
        return 2 * (weight + hight);
    }

    int getarea() {
        return weight * hight;
    }
}