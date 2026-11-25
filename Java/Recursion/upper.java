/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert String To Uppercase Using Recursion
*/

public class upper {

    // Recursive method
    static String toUpper(String str,int index) {

        // Base case
        if(index == str.length()) {
            return "";
        }

        // Convert current character
        char ch =Character.toUpperCase(str.charAt(index));

        // Recursive call
        return ch +toUpper(str,index + 1);
    }

    public static void main(String[] args) {

        String str = "java programming";

        System.out.println(toUpper(str, 0));
    }
}