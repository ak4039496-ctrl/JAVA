/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert Data To Lowercase Using Method Overloading
*/

public class lowercase {

    static String lower(String str) {

        return str.toLowerCase();
    }

    static char lower(char ch) {

        return Character.toLowerCase(ch);
    }

    static void lower(char[] arr) {

        for (char ch : arr) {

            System.out.print(Character.toLowerCase(ch)+ " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        char[] arr ={'J','A','V','A'};

        System.out.println(lower("JAVA,AMIT"));

        System.out.println(lower('A'));
        lower(arr);
    }
}