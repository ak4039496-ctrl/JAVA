/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: col_min.java
Purpose: Find minimum element in each column
*/

public class col_min {
    public static void main(String[] args) {
        int[][] arr = {
            {3, 7, 2},
            {9, 1, 5},
            {4, 6, 8}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            int minVal = arr[0][j];
            for (int i = 1; i < rows; i++) {
                if (arr[i][j] < minVal) minVal = arr[i][j];
            }
            System.out.println("Column " + (j+1) + " min = " + minVal);
        }
    }
}
