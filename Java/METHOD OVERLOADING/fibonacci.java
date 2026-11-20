/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Fibonacci Using Method Overloading
*/

public class fibonacci {

    // Print N terms
    static void fibonacci(int terms) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= terms; i++) {

            System.out.print(a + " ");

            int c = a + b;

            a = b;
            b = c;
        }

        System.out.println();
    }

    // Fibonacci till limit
    static void fibonacci(long limit) {

        long a = 0;
        long b = 1;

        while (a <= limit) {

            System.out.print(a + " ");

            long c = a + b;

            a = b;
            b = c;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        fibonacci(10);

        fibonacci(100L);
    }
}