/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert Data To Uppercase Using Method Overloading
*/

public class uppercase {

    // Convert string to uppercase
    static String upper(String str) {

        return str.toUpperCase();
    }

    // Convert character to uppercase
    static char upper(char ch) {

        return Character.toUpperCase(ch);
    }

    // Convert character array to uppercase
    static void upper(char[] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print( Character.toUpperCase(arr[i])+ " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        char[] letters ={'j', 'a', 'v', 'a'};

        System.out.println(upper("java programming"));

        System.out.println( upper('a'));

        upper(letters);
    }
}