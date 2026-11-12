/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Anagram Strings
*/

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    // Method to check anagram
    static boolean isAnagram(String str1,String str2) {

        char[] a = str1.toLowerCase().toCharArray();

        char[] b = str2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");

        sc.close();
    }
}