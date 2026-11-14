/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Characters Using Method
*/

import java.util.Scanner;

public class count_char {

    // Method to count characters
    static int countCharacters(String str) {

        return str.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Characters => "+ countCharacters(str));

        sc.close();
    }
}