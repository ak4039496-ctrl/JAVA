/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: col_lcm.java
Purpose: Find LCM of each column
*/

public class col_lcm {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int[][] arr = {
            {4, 6, 8},
            {10, 12, 14},
            {20, 24, 28}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            int colLcm = arr[0][j];
            for (int i = 1; i < rows; i++) {
                colLcm = lcm(colLcm, arr[i][j]);
            }
            System.out.println("Column " + (j+1) + " LCM = " + colLcm);
        }
    }
}
