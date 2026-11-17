/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Positive Number Using Method
*/

public class positive {

    // Method to check positive number
    static boolean isPositive(int num) {

        // Return true if number is positive
        return num > 0;
    }

    public static void main(String[] args) {

        // Given number
        int num = 50;

        // Method call
        if (isPositive(num))
            System.out.println("Positive Number");
        else
            System.out.println("Not Positive Number");
    }
}