/*
Author: Amit Gupta
Date: 19-Oct-2026
Purpose: Binary To Decimal Using Recursion
*/

public class decimal {

    // Recursive method
    static int binaryToDecimal(int num, int power) {

        // Base case
        if (num == 0) {
            return 0;
        }

        // Recursive case
        return (num % 10) *(int)Math.pow(2, power)+binaryToDecimal(num / 10,power + 1);
    }

    public static void main(String[] args) {

        int binary = 1010;

        System.out.println(binaryToDecimal(binary, 0));
    }
}