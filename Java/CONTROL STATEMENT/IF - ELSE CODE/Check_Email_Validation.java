/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if email contains '@' symbol
*/

import java.util.Scanner;

public class Check_Email_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email:- ");
        String email = sc.next();

        if(email.contains("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
