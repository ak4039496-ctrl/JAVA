/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Absolute Value Using Method
*/

public class absolute {

    // Method to find absolute value
    static int findAbsolute(int num) {

        // Convert negative to positive
        if (num < 0)
            return -num;

        // Return same number if already positive
        return num;
    }

    public static void main(String[] args) {

        // Given number
        int num = -45;

        // Display absolute value
        System.out.println("Absolute Value = "+ findAbsolute(num));
    }
}