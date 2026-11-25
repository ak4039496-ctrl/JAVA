/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Compare Two Strings Using Recursion
*/

public class str_compare {

    // Recursive method
    static boolean compare(String str1,String str2,int index) {

        // Length mismatch
        if (str1.length() != str2.length()) {
            return false;
        }

        // Base case
        if (index == str1.length()) {
            return true;
        }

        // Character mismatch
        if (str1.charAt(index)!=str2.charAt(index)) {

            return false;
        }

        // Recursive call
        return compare(str1,str2,index + 1);
    }

    public static void main(String[] args) {

        System.out.println(compare("Java","Java",0));
    }
}