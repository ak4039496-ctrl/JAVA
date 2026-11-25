/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Numbers From N To 1 Using Recursion
*/

public class print_rev {

    // Recursive method
    static void printReverse(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Print current number
        System.out.print(n + " ");

        // Recursive call
        printReverse(n - 1);
    }

    public static void main(String[] args) {

        printReverse(10);
    }
}