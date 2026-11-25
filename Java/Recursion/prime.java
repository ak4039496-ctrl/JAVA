/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Prime Number Using Recursion
*/

public class prime {

    // Recursive method
    static boolean isPrime(int num,int divisor) {

        // Base case
        if (num < 2) {
            return false;
        }

        if (divisor == 1) {
            return true;
        }

        if (num % divisor == 0) {
            return false;
        }

        return isPrime(num,divisor - 1);
    }

    public static void main(String[] args) {

        int num = 17;

        System.out.println(isPrime(num,num / 2));
    }
}