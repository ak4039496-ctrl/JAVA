/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Transpose Using Method
*/

public class transpose {

    // Method to display transpose
    static void printTranspose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Transpose:");

        for (int j = 0; j < cols; j++) {

            for (int i = 0; i < rows; i++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        printTranspose(matrix);
    }
}