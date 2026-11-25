/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find First Digit Using Recursion
*/

public class first_digit {

    // Recursive method
    static int firstDigit(int num) {

        // Base case
        if (num < 10) {
            return num;
        }

        // Recursive call
        return firstDigit(num / 10);
    }

    public static void main(String[] args) {

        int num = 987654;

        System.out.println("First Digit = "+ firstDigit(num));
    }
}