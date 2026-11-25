/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Zero Digits Using Recursion
*/

public class count_zero {

    // Recursive method
    static int countZero(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        // Current digit
        int digit = num % 10;

        // Check digit
        if (digit == 0) {

            return 1 +countZero(num / 10);
        }

        return countZero(num / 10);
    }

    public static void main(String[] args) {

        int num = 1002005;

        System.out.println("Zero Count = "+ countZero(num));
    }
}