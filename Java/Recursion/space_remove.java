/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Remove Spaces Using Recursion
*/

public class space_remove {

    // Recursive method
    static String removeSpaces( String str) {

        // Base case
        if (str.length() == 0) {
            return "";
        }

        char ch = str.charAt(0);

        // Skip spaces
        if (ch == ' ') {

            return removeSpaces(str.substring(1));
        }

        return ch +removeSpaces(str.substring(1));
    }

    public static void main(String[] args) {

        System.out.println(removeSpaces("I Love Java"));
    }
}
