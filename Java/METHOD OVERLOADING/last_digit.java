/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Last Digit Using Method Overloading
*/

public class last_digit {

    static int lastDigit(int num) {

        return num % 10;
    }

    static char lastDigit(String str) {

        return str.charAt(str.length() - 1);
    }

    public static void main(String[] args) {

        System.out.println(lastDigit(12345));

        System.out.println(lastDigit("Amit"));
    }
}