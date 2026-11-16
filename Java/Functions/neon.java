/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Neon Number Using Method
*/

public class neon {

    // Method to check neon number
    static boolean isNeon(int num) {

        // Square the number
        int square = num * num;

        // Store digit sum
        int sum = 0;

        // Calculate digit sum
        while (square > 0) {

            int digit = square % 10;

            sum += digit;

            square /= 10;
        }

        // Compare values
        return sum == num;
    }

    public static void main(String[] args) {

        // Given number
        int num = 9;

        // Method call
        if (isNeon(num))
            System.out.println(num + " is Neon");
        else
            System.out.println(num + " is Not Neon");
    }
}