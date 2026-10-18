/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print even numbers in each column
*/

public class col_even {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " evens => ");
            for (int i = 0; i < rows; i++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
