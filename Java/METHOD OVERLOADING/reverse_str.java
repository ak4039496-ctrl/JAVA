/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse Data Using Method Overloading
*/

public class reverse_str {

    // Reverse string
    static String reverse(String str) {

        return new StringBuilder(str).reverse().toString();
    }

    // Reverse integer
    static int reverse(int num) {

        int rev = 0;

        while (num > 0) {

            rev = rev * 10 + num % 10;

            num /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        System.out.println(reverse("Java"));

        System.out.println( reverse(12345));
    }
}