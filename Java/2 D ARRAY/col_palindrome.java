/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: col_palindrome.java
Purpose: Print palindrome numbers in each column
*/

public class col_palindrome {
    static boolean isPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {121, 34, 44},
            {123, 454, 22},
            {11, 78, 99}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " palindromes = ");
            for (int i = 0; i < rows; i++) {
                if (isPalindrome(arr[i][j])) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
