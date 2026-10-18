/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print diagonals column-wise
*/

public class col_diag {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Main diagonal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }

        System.out.println("\nSecondary diagonal:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][arr.length - 1 - i] + " ");
        }
    }
}
