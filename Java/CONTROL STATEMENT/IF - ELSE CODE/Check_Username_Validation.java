/*
Author: Amit Gupta
Date: 24-Aug-2026
Program: Check if username starts with 'user'
*/

import java.util.Scanner;

public class Check_Username_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username:- ");
        String user = sc.next();

        if(user.startsWith("user")) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }

        sc.close();
    }
}
