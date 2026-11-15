/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum of Fibonacci Series Using Method
*/

public class fibonacci_sum {

    // Method to calculate fibonacci sum
    static int fibonacciSum(int terms) {

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= terms; i++) {

            sum += a;

            int c = a + b;

            a = b;
            b = c;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Fibonacci Sum => "+ fibonacciSum(10));
    }
}