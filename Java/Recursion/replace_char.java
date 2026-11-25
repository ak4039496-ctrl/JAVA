/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Replace Character Using Recursion
*/

public class replace_char {

    // Recursive method
    static String replaceChar(String str, char oldChar,char newChar) {

        // Base case
        if (str.length() == 0) {
            return "";
        }

        char ch = str.charAt(0);

        // Replace character
        if (ch == oldChar) {
            ch = newChar;
        }

        return ch +replaceChar(str.substring(1),oldChar,newChar);
    }

    public static void main(String[] args) {

        System.out.println(replaceChar("banana",'a','o'));
    }
}