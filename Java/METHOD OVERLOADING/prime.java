/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Prime Number Using Method Overloading
*/

public class prime {

    // Check single number
    static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2;i <= num/2;i++) {

            if (num % i == 0)
                return false;
        }

        return true;
    }

    // Print prime range
    static void isPrime(int start,int end) {

        for (int i = start;i <= end;i++) {

            if (isPrime(i)) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println(isPrime(13));

        isPrime(1, 50);
    }
}