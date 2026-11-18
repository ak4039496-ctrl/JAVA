/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Strong Number Using Method
*/

public class strong {

    // Method to find factorial
    static int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    // Method to check strong number
    static boolean isStrong(int num) {

        int original = num;

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += factorial(digit);

            num /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        int num = 145;

        if (isStrong(num))
            System.out.println(num + " is Strong");
        else
            System.out.println(num + " is Not Strong");
    }
}