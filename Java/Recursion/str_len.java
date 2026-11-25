/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find String Length Using Recursion
*/

public class str_len {

    // Recursive method
    static int length(String str) {

        // Base case
        if(str.equals("")) {
            return 0;
        }

        // Recursive case
        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {

        String str = "Programming";

        System.out.println("Length = "+ length(str));
    }
}