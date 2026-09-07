/*
Author: Amit Gupta
Date: 16-Aug-2026
Program: Check if a character is a digit
*/

import java.util.Scanner;

public class Check_Character_Is_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character:- ");
        char ch = sc.next().charAt(0);

        if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is Not a Digit");
        }

        sc.close();
    }
}
