/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Palindrome String Using Method
*/

import java.util.Scanner;

public class palindrome_str {

    // Method to check palindrome
    static boolean isPalindrome(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            rev += str.charAt(i);
        }

        return str.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        if (isPalindrome(str))
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome String");

        sc.close();
    }
}