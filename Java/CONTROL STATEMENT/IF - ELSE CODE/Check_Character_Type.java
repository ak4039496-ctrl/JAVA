/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if character is vowel or consonant
*/

import java.util.Scanner;

public class Check_Character_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character:- ");
        char ch = sc.next().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
           ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Character is Vowel");
        } else {
            System.out.println("Character is Consonant");
        }

        sc.close();
    }
}
