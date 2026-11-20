/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: First Digit Using Method Overloading
*/

public class first_digit {

    static int firstDigit(int num) {

        while (num >= 10) {

            num /= 10;
        }

        return num;
    }

    static char firstDigit(String str) {

        return str.charAt(0);
    }

    public static void main(String[] args) {

        System.out.println(firstDigit(98765));

        System.out.println( firstDigit("Java"));
    }
}