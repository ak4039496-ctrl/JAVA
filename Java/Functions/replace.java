/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Replace Character Using Method
*/

import java.util.Scanner;

public class replace {

    // Method to replace character
    static String replaceChar(String str,char oldChar,char newChar) {
        return str.replace(oldChar, newChar);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Old Character: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("New Character: ");
        char newChar = sc.next().charAt(0);

        System.out.println(replaceChar(str, oldChar, newChar));

        sc.close();
    }
}