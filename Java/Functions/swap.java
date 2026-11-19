/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Swap Two Numbers Using Method
*/

public class swap {

    // Method to swap numbers
    static void swapNum(int a, int b) {

        // Display original values
        System.out.println("Before Swap:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // Temporary variable for swapping
        int temp = a;

        // Assign b into a
        a = b;

        // Assign temp into b
        b = temp;

        // Display swapped values
        System.out.println("After Swap:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

    public static void main(String[] args) {

        // Method call
        swapNum(10, 20);
    }
}