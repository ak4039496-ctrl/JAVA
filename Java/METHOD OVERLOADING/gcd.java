/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find GCD Using Method Overloading
*/

public class gcd {

    // GCD of two numbers
    static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // GCD of three numbers
    static int gcd(int a,int b,int c) {

        return gcd(gcd(a, b), c);
    }

    // GCD of array elements
    static int gcd(int[] arr) {

        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {

            result = gcd(result, arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {24, 36, 60};

        System.out.println(gcd(12, 18));

        System.out.println(gcd(12, 18, 24));

        System.out.println(gcd(arr));
    }
}