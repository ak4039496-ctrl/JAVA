/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: col_gcd.java
Purpose: Find GCD of each column
*/

public class col_gcd {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {12, 18, 24},
            {6, 12, 30},
            {9, 15, 21}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            int colGcd = arr[0][j];
            for (int i = 1; i < rows; i++) {
                colGcd = gcd(colGcd, arr[i][j]);
            }
            System.out.println("Column " + (j+1) + " GCD = " + colGcd);
        }
    }
}
