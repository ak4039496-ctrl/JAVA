/*
Author: Amit Gupta
Date: 05-09-2026
Program: Reverse a string using for loop
*/

public class Reverse_string {
    public static void main(String[] args) {
        String str = "GitHub";
        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + rev);
    }
}
