/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Prime Numbers in Range
*/

public class prime_range {

    // Method to check prime
    static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i <= num/2; i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int start = 1;
        int end = 50;

        for (int i = start; i <= end; i++) {

            if (isPrime(i))
                System.out.print(i + " ");
        }
    }
}