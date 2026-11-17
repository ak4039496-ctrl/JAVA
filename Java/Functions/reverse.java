/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse a Number Using Method
*/

public class reverse {

    // Method to reverse a number
    static int reverseNumber(int num) {

        // Store reversed number
        int reverse = 0;

        // Repeat until number becomes 0
        while (num > 0) {

            // Extract last digit
            int digit = num % 10;

            // Add digit to reversed number
            reverse = reverse * 10 + digit;

            // Remove last digit
            num = num / 10;
        }

        // Return reversed value
        return reverse;
    }

    public static void main(String[] args) {

        // Initialize number
        int num = 12345;

        // Call method
        int result = reverseNumber(num);

        // Display original number
        System.out.println("Original Number = " + num);

        // Display reversed number
        System.out.println("Reversed Number = " + result);
    }
}