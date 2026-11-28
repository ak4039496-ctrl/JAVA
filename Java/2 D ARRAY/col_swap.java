/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Swap two columns in a matrix
*/

public class col_swap {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int c1 = 0, c2 = 2; // swap col 1 and col 3
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][c1];
            arr[i][c1] = arr[i][c2];
            arr[i][c2] = temp;
        }

        System.out.println("Matrix after column swap:");
        for (int[] row : arr) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
