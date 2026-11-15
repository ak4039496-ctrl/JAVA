/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum of Factorials Using Method
*/

public class factorial_sum {

    // Method to calculate factorial
    static long factorial(int num) {

        long fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    // Method to calculate factorial sum
    static long factorialSum(int n) {

        long sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += factorial(i);
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial Sum => "+ factorialSum(n));
    }
}