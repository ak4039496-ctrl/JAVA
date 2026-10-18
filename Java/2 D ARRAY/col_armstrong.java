/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Armstrong numbers in each column
*/

public class col_armstrong {
    static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digits = String.valueOf(n).length();
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {153, 12, 370},
            {371, 407, 22},
            {10, 11, 9}
        };

        int rows = arr.length, cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " Armstrongs => ");
            for (int i = 0; i < rows; i++) {
                if (isArmstrong(arr[i][j])){
                    System.out.print(arr[i][j] + " ");
                }
                 
            }
            System.out.println();
        }
    }
}
