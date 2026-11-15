/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Factorial from 1 to N
*/

public class factorial_range {

    // Method to calculate factorial
    static long factorial(int num) {

        long fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        // Range loop
        for (int i = 1; i <= 10; i++) {

            System.out.println(i +"! = " + factorial(i));
        }
    }
}