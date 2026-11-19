/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Toggle String Case Using Method
*/

import java.util.Scanner;

public class toggle {

    // Method to toggle case
    static String toggleCase(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else
                result += Character.toUpperCase(ch);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Toggle Case = "+ toggleCase(str));

        sc.close();
    }
}