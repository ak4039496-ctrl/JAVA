/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Palindrome Number Using Recursion
*/

public class palindrome {

    static int reverse = 0;

    // Reverse recursively
    static int reverseNumber(int num) {

        if (num == 0) {
            return reverse;
        }

        reverse = reverse * 10 + num % 10;

        return reverseNumber(num / 10);
    }

    // Palindrome check
    static boolean isPalindrome(int num) {

        reverse = 0;

        return num ==reverseNumber(num);
    }

    public static void main(String[] args) {

        int num = 121;

        if (isPalindrome(num)) {

            System.out.println("Palindrome");
        }
        else {

            System.out.println("Not Palindrome");
        }
    }
}