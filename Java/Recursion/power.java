/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Power Using Recursion
*/

public class power {

    // Recursive power method
    static long power(int base, int exponent) {

        // Base case
        if (exponent == 0) {
            return 1;
        }

        // Recursive case
        return base *power(base,exponent - 1);
    }

    public static void main(String[] args) {

        System.out.println("Answer = "+ power(2, 5));
    }
}