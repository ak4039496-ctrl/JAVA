/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Addition Using Method
*/

public class matrix_add {

    // Method to add matrices
    static void addMatrix(int[][] a,int[][] b) {

        int rows = a.length;
        int cols = a[0].length;

        int[][] sum =new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                sum[i][j] =a[i][j] + b[i][j];
            }
        }

        System.out.println("Result:");

        for (int[] row : sum) {

            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {
                {1, 2},
                {3, 4}
        };

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        addMatrix(a, b);
    }
}