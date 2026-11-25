/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert Decimal To Binary Using Recursion
*/

public class binary {

    // Recursive method
    static void decimalToBinary(int num) {

        // Base case
        if (num == 0) {
            return;
        }

        // Recursive call
        decimalToBinary(num / 2);

        // Print remainder
        System.out.print(num % 2);
    }

    public static void main(String[] args) {

        int num = 5;

        System.out.print("Binary => ");

        decimalToBinary(num);
    }
}