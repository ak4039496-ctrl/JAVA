/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find LCM Using Recursion
*/

public class lcm {

    // Recursive GCD
    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    // Find LCM
    static int lcm(int a, int b) {

        return (a * b) /gcd(a, b);
    }

    public static void main(String[] args) {

        System.out.println("LCM = " +lcm(12, 18));
    }
}