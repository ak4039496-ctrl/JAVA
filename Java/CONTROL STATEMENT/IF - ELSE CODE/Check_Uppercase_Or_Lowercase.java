/*
Author: Amit Gupta
Date: 26-Aug-2026
Program: Check if a character is Uppercase or Lowercase
*/

import java.util.Scanner;

public class Check_Uppercase_Or_Lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character:- ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase");
        } else if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase");
        } else {
            System.out.println(ch + " is Not an Alphabet");
        }

        sc.close();
    }
}
