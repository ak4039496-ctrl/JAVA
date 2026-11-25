/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Remove Adjacent Duplicate Characters
Using Recursion
*/

public class remove_dup {

    static String removeDuplicate(String str) {

        // Base case
        if(str.length() <= 1) {
            return str;
        }
        // Check adjacent duplicates
        if(str.charAt(0)==str.charAt(1)) {

            return removeDuplicate(str.substring(1));
        }

        return str.charAt(0)+removeDuplicate( str.substring(1));
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicate("aaabbbccc"));
    }
}