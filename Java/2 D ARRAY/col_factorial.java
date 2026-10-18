/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print factorial of each element column-wise
*/

public class col_factorial {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {3, 4, 5},
            {2, 6, 3},
            {1, 7, 2}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " factorials => ");
            for (int i = 0; i < rows; i++) {
                System.out.print(factorial(arr[i][j]) + " "); //call & print return
            }
            System.out.println();
        }
        
    }
}
