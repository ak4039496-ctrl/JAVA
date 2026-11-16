/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find GCD Using Method
*/

public class gcd {

    // Method to calculate GCD
    static int findGcd(int a, int b) {

        // Apply Euclid Algorithm
        while (b != 0) {

            // Store b
            int temp = b;

            // Update b
            b = a % b;

            // Update a
            a = temp;
        }

        // Return GCD
        return a;
    }

    public static void main(String[] args) {

        // Numbers
        int num1 = 24;
        int num2 = 36;

        // Method call
        int result = findGcd(num1, num2);

        // Display output
        System.out.println("GCD => " + result);
    }
}