/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find GCD Using Recursion
*/

public class gcd {

    // Recursive GCD Method
    static int findGcd(int a, int b) {

        // Base case
        if (b == 0) {
            return a;
        }

        // Recursive call
        return findGcd(b, a % b);
    }

    public static void main(String[] args) {

        System.out.println("GCD => " +findGcd(48, 18));
    }
}