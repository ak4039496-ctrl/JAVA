/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse String Using Recursion
*/

public class str_rev {

    // Recursive method
    static String reverse(String str) {

        // Base case
        if(str.length() <= 1) {
            return str;
        }

        // Recursive case
        return reverse(str.substring(1))+ str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "Java";

        System.out.println(reverse(str));
    }
}