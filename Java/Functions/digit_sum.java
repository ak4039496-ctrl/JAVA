/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Sum of Digits Using Method
*/

public class digit_sum {

    // Method to calculate digit sum
    static int findDigitSum(int num) {

        // Store total sum
        int sum = 0;

        // Process all digits
        while (num > 0) {

            // Extract last digit
            int digit = num % 10;

            // Add digit to sum
            sum = sum + digit;

            // Remove last digit
            num = num / 10;
        }

        // Return sum
        return sum;
    }

    public static void main(String[] args) {

        // Given number
        int num = 12345;

        // Call method
        int result = findDigitSum(num);

        // Display result
        System.out.println("Digit Sum => " + result);
    }
}