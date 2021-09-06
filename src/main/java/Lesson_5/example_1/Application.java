package Lesson_5.example_1;

import java.util.Random;

public class Application {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int m = new Random().nextInt(5) + 5;
        int n = new Random().nextInt(5) + 5;

        int[] dividends = new int[m];
        int[] dividers = new int[n];
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            dividends[i] = new Random().nextInt(5) + 4;
        }
        for (int i = 0; i < n; i++) {
            dividers[i] = new Random().nextInt(3);
        }
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                try {
                    result[l][k] = dividends[k] / dividers[l];
                } catch (ArithmeticException exc) {
                    result[l][k] = -1;
                }
            }
        }
        System.out.println();
        for (int dividend : dividends)
            System.out.print(dividend + " ");
        System.out.println();

        System.out.println();
        for (int divider : dividers)
            System.out.print(divider + " ");
        System.out.println();

        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[j][i] + " ");
            }
            System.out.println();
        }
    }
}