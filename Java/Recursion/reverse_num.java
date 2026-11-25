/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse Number Using Recursion
*/

public class reverse_num {

    static int reverse = 0;

    // Recursive method
    static int reverseNumber(int num) {

        // Base case
        if (num == 0) {
            return reverse;
        }

        // Build reverse
        reverse =reverse * 10 +num % 10;

        // Recursive call
        return reverseNumber(
                num / 10);
    }

    public static void main(String[] args) {

        System.out.println(reverseNumber(12345));
    }
}