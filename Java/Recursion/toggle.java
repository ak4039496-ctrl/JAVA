/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Toggle String Case Using Recursion
*/

public class toggle {

    static String toggleCase(String str,int index) {

        // Base case
        if(index == str.length()) {
            return "";
        }

        char ch =str.charAt(index);

        if(Character.isUpperCase(ch)) {

            ch =Character.toLowerCase(ch);
        }
        else {
            ch =Character.toUpperCase(ch);
        }

        return ch +toggleCase(str,index + 1);
    }

    public static void main(String[] args) {

        System.out.println(toggleCase("jaVa",0));
    }
}