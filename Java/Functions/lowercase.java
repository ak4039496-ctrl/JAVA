/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert String to Lowercase
*/

import java.util.Scanner;

public class lowercase {

    // Method to convert lowercase
    static String toLower(String str) {

        return str.toLowerCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Lowercase = "+ toLower(str));

        sc.close();
    }
}