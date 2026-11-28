/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Swap multiple columns in a matrix
*/

public class col_swap_adv {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Swap column 2 with column 4
        int c1 = 0, c2 = 3;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][c1+1];
            arr[i][c1+1] = arr[i][c2];
            arr[i][c2] = temp;
        }

        System.out.println("Matrix after column swap:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
