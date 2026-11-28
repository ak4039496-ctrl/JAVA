/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Calculate sum of each column and overall sum
*/

public class col_sum_adv {
    public static void main(String[] args) {
        int[][] arr = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int total = 0;

        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][j];
                total += arr[i][j];
            }
            System.out.println("Column " + (j+1) + " sum = " + colSum);
        }
        System.out.println("Total sum = " + total);
    }
}
