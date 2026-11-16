/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Palindrome Number Using Method
*/

public class palindrome {

    // Method to check palindrome
    static boolean isPalindrome(int num) {

        // Store original number
        int original = num;

        // Store reverse number
        int reverse = 0;

        // Reverse logic
        while (num > 0) {

            // Extract digit
            int digit = num % 10;

            // Build reverse number
            reverse = reverse * 10 + digit;

            // Remove last digit
            num = num / 10;
        }

        // Compare numbers
        return original == reverse;
    }

    public static void main(String[] args) {

        // Given number
        int num = 121;

        // Check palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is Palindrome");
        } else {
            System.out.println(num + " is Not Palindrome");
        }
    }
}