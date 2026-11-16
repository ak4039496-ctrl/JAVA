/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find String Length Using Method
*/

import java.util.Scanner;

public class length {

    // Method to find length
    static int findLength(String str) {

        // Return length
        return str.length();
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        // Method call
        int len = findLength(str);

        // Display result
        System.out.println("Length = " + len);

        sc.close();
    }
}