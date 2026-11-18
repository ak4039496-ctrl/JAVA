/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Search Character Using Method
*/

import java.util.Scanner;

public class search {

    // Method to search character
    static boolean searchChar(String str, char target) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        if (searchChar(str, ch))
            System.out.println("Character Found");
        else
            System.out.println("Character Not Found");

        sc.close();
    }
}