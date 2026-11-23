/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Power Using Method Overloading
*/

public class power {

    // Square
    static int power(int num) {

        return num * num;
    }

    // Power with exponent
    static long power(int base,int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    // Double base power
    static double power(double base,int exp) {

        return Math.pow(base, exp);
    }

    public static void main(String[] args) {

        System.out.println(power(5));

        System.out.println(power(2, 5));

        System.out.println(power(2.5, 3));
    }
}