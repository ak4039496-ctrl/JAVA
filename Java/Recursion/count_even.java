/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Even Digits Using Recursion
*/

public class count_even {

    static int countEven(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        if (digit % 2 == 0) {

            return 1 +countEven(num / 10);
        }

        return countEven(num / 10);
    }

    public static void main(String[] args) {

        int num = 123456789;

        System.out.println("Even Digits = "+ countEven(num));
    }
}