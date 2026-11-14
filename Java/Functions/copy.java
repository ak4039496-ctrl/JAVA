/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Copy String Using Method
*/

import java.util.Scanner;

public class copy {

    // Method to copy string
    static String copyString(String str) {

        // Return copied string
        return str;
    }

    public static void main(String[] args) {

        // Create scanner object
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        // Method call
        String copied = copyString(str);

        // Display result
        System.out.println("Copied String => " + copied);

        sc.close();
    }
}