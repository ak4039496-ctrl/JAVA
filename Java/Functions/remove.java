/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Remove Character Using Method
*/

import java.util.Scanner;

public class remove {

    // Method to remove character
    static String removeChar(String str, char ch) {
        return str.replace(String.valueOf(ch), "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Character To Remove: ");
        char ch = sc.next().charAt(0);

        System.out.println(removeChar(str, ch));

        sc.close();
    }
}