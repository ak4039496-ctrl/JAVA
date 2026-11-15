/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Fibonacci Series Using Method
*/

public class fibonacci {

    // Method to print fibonacci series
    static void printFibonacci(int terms) {

        // First term
        int a = 0;

        // Second term
        int b = 1;

        // Loop for series
        for (int i = 1; i <= terms; i++) {

            // Print current term
            System.out.print(a + " ");

            // Find next term
            int c = a + b;

            // Update values
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        // Display heading
        System.out.println("Fibonacci Series:");

        // Method call
        printFibonacci(10);
    }
}