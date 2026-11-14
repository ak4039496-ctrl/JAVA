/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Concatenate Two Strings Using Method
*/

import java.util.Scanner;

public class concat {

    // Method to join strings
    static String joinStrings(String str1, String str2) {

        // Return concatenated string
        return str1 + str2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        // Method call
        String result = joinStrings(str1, str2);

        System.out.println("Result => " + result);

        sc.close();
    }
}