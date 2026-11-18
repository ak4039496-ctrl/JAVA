/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Numbers in Reverse Range Using Method
*/

public class reverse_range {

    // Method to print reverse range
    static void printReverse(int start, int end) {

        // Print reverse numbers
        for (int i = end; i >= start; i--) {

            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {

        // Method call
        printReverse(1, 20);
    }
}