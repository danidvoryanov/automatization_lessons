package Lesson_2;

public class inversion {
    public static void main(String[] args) {
        int p = 3;
        int k = 5;

        int[][] arr = new int[p][k];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = (int) (Math.random() * 2);
            }
        }

        int q = (int) (1 + Math.random() * (p - 2));
        int w = (int) (1 + Math.random() * (k - 2));
        arr[q][w] = 2;

        System.out.println();

        for (int[] y : arr) {
            for (int x : y) {
                System.out.print(x + " ");
            }
            System.out.println();
        }


        int inversion = 0;
        boolean bol = false;
        int[][] inversionmtrx = new int[p][k];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < k; j++) {
                if (arr[i][j] == 2) {
                    inversionmtrx[i][j] = 2;
                    inversion = 1;
                    bol = true;
                    continue;
                } else
                    inversionmtrx[i][j] = bol
                            ? (arr[i][j] + 1) % 2
                            : arr[i][j];
            }
        }
        System.out.println();

        System.out.println();

        for (int[] row : inversionmtrx) {
            for (int element : row)
                System.out.print(element + " ");
            System.out.println();
        }


    }
}
