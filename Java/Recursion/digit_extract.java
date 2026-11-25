/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Extract Digits Using Recursion
*/

public class digit_extract {

    // Recursive method
    static void extractDigits(int num) {

        // Base case
        if (num == 0) {
            return;
        }

        // Recursive call
        extractDigits(num / 10);

        // Print digit
        System.out.print(num % 10 + " ");
    }

    public static void main(String[] args) {

        extractDigits(12345);
    }
}