/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Negative Number Using Method
*/

public class negative {

    // Method to check negative number
    static boolean isNegative(int num) {

        // Return true if number is negative
        return num < 0;
    }

    public static void main(String[] args) {

        // Given number
        int num = -20;

        // Method call
        if (isNegative(num))
            System.out.println("Negative Number");
        else
            System.out.println("Not Negative Number");
    }
}