/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find First Digit Using Method
*/

public class first_digit {

    // Method to find first digit
    static int getFirstDigit(int num) {

        // Continue until single digit remains
        while (num >= 10) {

            // Remove last digit
            num = num / 10;
        }

        // Return first digit
        return num;
    }

    public static void main(String[] args) {

        // Given number
        int num = 987654;

        // Method call
        int result = getFirstDigit(num);

        // Display number
        System.out.println("Number = " + num);

        // Display first digit
        System.out.println("First Digit = " + result);
    }
}
