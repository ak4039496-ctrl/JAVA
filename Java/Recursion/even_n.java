/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Even Numbers Using Recursion
*/

public class even_n {

    // Recursive method
    static void printEven(int n) {

        // Base case
        if (n <= 0) {
            return;
        }

        // Recursive call
        printEven(n - 2);

        // Print even number
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        printEven(20);
    }
}