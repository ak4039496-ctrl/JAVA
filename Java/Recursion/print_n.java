/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Numbers From 1 To N Using Recursion
*/

public class print_n {

    // Recursive method
    static void print(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        print(n - 1);

        // Print number
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        // Method call
        print(10);
    }
}