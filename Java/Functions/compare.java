/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Compare Two Strings Using Method
*/

import java.util.Scanner;

public class compare {

    // Method to compare strings
    static boolean compareStrings(String str1, String str2) {

        // Compare strings
        return str1.equals(str2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if (compareStrings(str1, str2))
            System.out.println("Strings Are Equal");
        else
            System.out.println("Strings Are Not Equal");

        sc.close();
    }
}