/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert String To Lowercase Using Recursion
*/

public class lower {

    // Recursive method
    static String toLower(String str,int index) {

        // Base case
        if(index == str.length()) {
            return "";
        }

        char ch =Character.toLowerCase(str.charAt(index));

        return ch +toLower(str,index + 1);
    }

    public static void main(String[] args) {

        String str = "JAVA PROGRAMMING";

        System.out.println(toLower(str, 0));
    }
}