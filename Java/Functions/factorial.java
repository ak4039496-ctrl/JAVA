/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Factorial Using Method
*/

public class factorial {

    // Method to calculate factorial
    static long findFactorial(int num) {

        // Store factorial value
        long fact = 1;

        // Multiply numbers from 1 to num
        for (int i = 1; i <= num; i++) {

            // Update factorial
            fact = fact * i;
        }

        // Return factorial
        return fact;
    }

    public static void main(String[] args) {

        // Declare and initialize number
        int num = 5;

        // Call method
        long result = findFactorial(num);

        // Display number
        System.out.println("Number = " + num);

        // Display factorial
        System.out.println("Factorial = " + result);
    }
}