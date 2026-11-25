/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert Decimal To Octal Using Recursion
*/

public class octal {

    // Recursive method
    static void decimalToOctal(int num) {

        // Base case
        if (num == 0) {
            return;
        }

        // Recursive call
        decimalToOctal(num / 8);

        // Print octal digit
        System.out.print(num % 8);
    }

    public static void main(String[] args) {

        int num = 100;

        System.out.print("Octal => ");

        decimalToOctal(num);
    }
}