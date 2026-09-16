/*
Author: Amit Gupta
Date: 26-Aug-2026
Program: Check if a character is Vowel or Consonant
*/

public class Check_Vowel_Or_Consonant {
    public static void main(String[] args) {
        char ch = 'a';

        // if-else to check vowel
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            System.out.println(ch + " is Vowel");
        } else {
            System.out.println(ch + " is Consonant");
        }
    }
}
