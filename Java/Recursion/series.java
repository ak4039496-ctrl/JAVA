/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Natural Series Using Recursion
*/

public class series {

    // Recursive method
    static void printSeries(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printSeries(n - 1);

        // Print current value
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        printSeries(20);
    }
}