package Lesson_2.example_1;

public class Friday {

    void while0(String[] array) {
        int i = 0;
        while (i < array.length) {

            {
                if (i == array.length - 1) {
                    System.out.println(array[i] + ".");
                } else System.out.print(array[i] + " ");
                i++;
            }
        }
    }

    void foreach0(String[] array) {
        for (int n = 0; n < array.length; ) {
            if (n == array.length - 1) {
                System.out.println(array[n] + ".");
            } else System.out.print(array[n] + " ");
            n++;
        }

    }

    void for0(String[] array) {
        int a = 0;
        for (String b : array) {
            if (a == array.length - 1) {
                System.out.println(b + ".");
            } else System.out.print(b + " ");
            a++;
        }
    }

    public static void main(String[] args) {
        Friday gf = new Friday();

        String[] friday = {"Пятница", "это", "лучший", "день", "недели"};

        gf.while0(friday);
        gf.foreach0(friday);
        gf.for0(friday);

    }
}
