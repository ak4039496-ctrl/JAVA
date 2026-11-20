/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Factorial Using Method Overloading
*/

public class factorial {

    // Factorial of int number
    static long factorial(int num) {

        long fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    // Factorial of long number
    static long factorial(long num) {

        long fact = 1;

        for (long i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    // Factorial from start to end
    static void factorial(int start,int end) {

        for (int i = start; i <= end; i++) {

            System.out.println(i + "! = " + factorial(i));
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(5));

        System.out.println(factorial(6L));
        
        factorial(1, 5);
    }
}