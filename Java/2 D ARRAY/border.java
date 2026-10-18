/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: border.java
Purpose: Print border elements of a matrix
*/

public class border {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        System.out.println("Border elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
