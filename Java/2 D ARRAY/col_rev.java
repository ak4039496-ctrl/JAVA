/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse each column of a matrix
*/

public class col_rev {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Matrix after column reversal:");
        for (int j = 0; j < cols; j++) {
            for (int i = rows - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
