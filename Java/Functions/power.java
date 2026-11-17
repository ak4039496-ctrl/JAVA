/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Calculate Power Using Method
*/

public class power {

    // Method to calculate power
    static long findPower(int base, int exponent) {

        // Initial value
        long result = 1;

        // Calculate power
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        // Return final answer
        return result;
    }

    public static void main(String[] args) {

        // Method call
        long ans = findPower(2, 5);

        // Display output
        System.out.println("Power => " + ans);
    }
}