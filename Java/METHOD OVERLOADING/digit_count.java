/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Digit Count Using Method Overloading
*/

public class digit_count {

    static int count(int num) {

        return String.valueOf(num).length();
    }

    static int count(long num) {

        return String.valueOf(num).length();
    }

    static int count(String text) {

        return text.length();
    }

    public static void main(String[] args) {

        System.out.println(count(12345));

        System.out.println(count(123456789L));

        System.out.println(count("Java"));
    }
}