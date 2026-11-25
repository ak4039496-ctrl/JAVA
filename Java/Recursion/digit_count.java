/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Digits Using Recursion
*/

public class digit_count {

    // Recursive method
    static int countDigits(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        // Recursive case
        return 1 +countDigits(num / 10);
    }

    public static void main(String[] args) {

        System.out.println(countDigits(123456));
    }
}