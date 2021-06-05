package Lesson_2.example_5;

public class Transporting {
    public static void main(String[] args) {

        int n = 5;
        int h = 3;
        int[][] a = new int[n][h];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h; j++) {
                a[i][j] = n * i + j;
            }
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < h; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][j];
                a[i][j] = temp;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < h; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

    }
}
