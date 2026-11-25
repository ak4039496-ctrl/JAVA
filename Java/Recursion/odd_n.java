/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Odd Numbers Using Recursion
*/

public class odd_n {

    // Recursive method
    static void printOdd(int n) {

        // Base case
        if (n <= 0) {
            return;
        }

        // Recursive call
        printOdd(n - 2);

        // Print odd number
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        printOdd(19);
    }
}