/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum of Powers Using Method
*/

public class power_sum {

    // Method to calculate power
    static long power(int base, int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {

            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        long sum = 0;

        // Calculate sum of powers
        for (int i = 1; i <= 5; i++) {

            sum += power(i, 2);
        }

        System.out.println("Power Sum = " + sum);
    }
}