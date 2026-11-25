/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Prime Numbers In Range Using Recursion
*/

public class prime_range {

    // Prime check recursively
    static boolean isPrime(int num,int divisor) {

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

    // Print prime range recursively
    static void printPrimeRange(int current,int end) {

        if (current > end) {
            return;
        }

        if (isPrime(current,current / 2)) {

            System.out.print(current + " ");
        }

        printPrimeRange(current + 1,end);
    }

    public static void main(String[] args) {

        printPrimeRange(1, 50);
    }
}