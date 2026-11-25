/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Remove Character From String
Using Recursion
*/

public class remove_char {

    static String removeChar(String str,char target) {

        // Base case
        if(str.length() == 0) {
            return "";
        }

        char ch =str.charAt(0);

        // Skip target character
        if(ch == target) {

            return removeChar(str.substring(1),target);
        }

        return ch +removeChar(str.substring(1),target);
    }

    public static void main(String[] args) {

        System.out.println(removeChar("programmingmm m",'m'));
    }
}