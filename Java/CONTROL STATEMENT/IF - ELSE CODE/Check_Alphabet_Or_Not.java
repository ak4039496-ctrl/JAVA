/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if a character is an Alphabet or Not
*/

import java.util.Scanner;

public class Check_Alphabet_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character:- ");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet");
        } else {
            System.out.println(ch + " is Not an Alphabet");
        }

        sc.close(); 
    }
}
