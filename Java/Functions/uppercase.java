/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Convert String to Uppercase
*/

import java.util.Scanner;

public class uppercase {

    // Method to convert uppercase
    static String toUpper(String str) {

        return str.toUpperCase();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Uppercase = "+ toUpper(str));

        sc.close();
    }
}