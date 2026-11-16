/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Calculate NPR Using Method
*/

public class npr {

    // Method for factorial
    static long factorial(int num) {

        long fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    // Method to calculate NPR
    static long findNpr(int n, int r) {

        return factorial(n)/ factorial(n - r);
    }

    public static void main(String[] args) {

        System.out.println("NPR => " + findNpr(5, 2));
    }
}