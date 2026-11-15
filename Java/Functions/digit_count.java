/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Digits Using Method
*/

public class digit_count {

    // Method to count digits
    static int countDigits(int num) {

        // Counter variable
        int count = 0;

        // Run loop
        while (num > 0) {

            // Increase count
            count++;

            // Remove last digit
            num = num / 10;
        }

        // Return count
        return count;
    }

    public static void main(String[] args) {

        // Given number
        int num = 987654;

        // Method call
        int result = countDigits(num);

        // Display result
        System.out.println("Total Digits = " + result);
    }
}