/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Odd Digits Using Recursion
*/

public class count_odd {

    static int countOdd(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        if (digit % 2 != 0) {

            return 1 +countOdd(num / 10);
        }

        return countOdd(num / 10);
    }

    public static void main(String[] args) {

        int num = 123456789;

        System.out.println("Odd Digits = "+ countOdd(num));
    }
}
