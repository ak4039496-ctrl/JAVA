/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print sum of digits of each element column-wise
*/

public class col_sum_digits {
    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {12, 34, 56},
            {78, 90, 11},
            {22, 33, 44}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " digit sums = ");
            for (int i = 0; i < rows; i++) {
                System.out.print(digitSum(arr[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
