/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse digits of each element column-wise
*/

public class col_reverse_num {
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
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
            System.out.print("Column " + (j+1) + " reversed => ");
            for (int i = 0; i < rows; i++) {
                System.out.print(reverse(arr[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
