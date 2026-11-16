/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Palindrome Numbers in Range
*/

public class palindrome_range {

    // Method to check palindrome
    static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {

            reverse = reverse * 10 + num % 10;

            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (isPalindrome(i))
                System.out.print(i + " ");
        }
    }
}