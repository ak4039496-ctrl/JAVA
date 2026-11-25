/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check String Palindrome Using Recursion
*/

public class str_palin {

    static boolean palindrome(String str,int start,int end) {

        // Base case
        if(start >= end) {
            return true;
        }

        // Character mismatch
        if(str.charAt(start)!=str.charAt(end)) {

            return false;
        }

        // Recursive call
        return palindrome(str,start + 1,end - 1);
    }

    public static void main(String[] args) {

        String str = "madam";

        System.out.println(palindrome(str, 0 ,str.length()-1));
    }
}