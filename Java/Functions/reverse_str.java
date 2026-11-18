/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse String Using Method
*/

import java.util.Scanner;

public class reverse_str {

    // Method to reverse string
    static String reverse(String str) {

        // Store reversed string
        String rev = "";

        // Traverse string backwards
        for (int i = str.length() - 1; i >= 0; i--) {

            rev += str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Reverse => " +reverse(str));

        sc.close();
    }
}