/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Multiplication Using Method
*/

public class matrix_mul {

    // Method to multiply matrices
    static void multiplyMatrix(int[][] a,int[][] b) {

        int[][] result =new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0;j < b[0].length; j++) {
                for (int k = 0;k < b.length; k++) {
                    result[i][j] +=a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = {{1, 2},{3, 4}};

        int[][] b = {
                {5, 6},
                {7, 8}
        };

        multiplyMatrix(a, b);
    }
}