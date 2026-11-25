/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Search Character Using Recursion
*/

public class search_char {

    // Recursive method
    static boolean search(String str,char target,int index) {

        // Base case
        if (index == str.length()) {
            return false;
        }

        // Character found
        if (str.charAt(index)== target) {
            System.out.println("Index "+ index);
            return true;
        }

        // Recursive call
        return search(str,target,index + 1);
    }

    public static void main(String[] args) {

        String str ="Programming";

        System.out.println(search(str,'g',0));
    }
}