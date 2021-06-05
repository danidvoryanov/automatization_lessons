package Lesson_2.example_2;

public class TwoDimensionalArray {
    void while1(int[][] array) {
        for (int p = 0; p < 8; p++) {
            for (int k = 0; k < 8; k++) {

                System.out.print(array[p][k] + " ");
            }
            System.out.println();
        }
    }

    void while43(int[][] arr) {
        int p = 0;
        while (p < 8) {
            int k = 0;
            while (k < 8) {
                System.out.print(arr[p][k] + " ");
                k++;
            }
            System.out.println();
            p++;
        }
    }

    void dvuhForEch(int[][] arr3) {
        for (int[] arr4 : arr3) {
            for (int y : arr4) {
                System.out.print(y + " ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        TwoDimensionalArray matrix = new TwoDimensionalArray();
        int[][] matrix12 = new int[8][8];

        for (int p = 0; p < 8; p++) {
            for (int k = 0; k < 8; k++) {
                if (k % 2 == 0) matrix12[p][k] = 0;
                else matrix12[p][k] = 1;
            }
        }
        matrix.while1(matrix12);
        matrix.dvuhForEch(matrix12);
        matrix.while43(matrix12);
    }
}