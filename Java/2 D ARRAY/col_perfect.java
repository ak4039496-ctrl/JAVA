/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: col_perfect.java
Purpose: Print perfect numbers in each column
*/

public class col_perfect {
    static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) 
            sum += i;
        }
        return sum == n && n != 1;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {6, 28, 12},
            {496, 18, 20},
            {8128, 22, 28}
        };

        int rows = arr.length, cols = arr[0].length;
        for (int j = 0; j < cols; j++) {

            System.out.print("Column " + (j+1) + " perfects => ");

            for (int i = 0; i < rows; i++) {

                if (isPerfect(arr[i][j]))
                
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
