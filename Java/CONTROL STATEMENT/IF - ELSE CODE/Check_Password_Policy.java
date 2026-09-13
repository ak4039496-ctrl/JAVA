/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check password policy (length >= 8 and contains '@')
*/

import java.util.Scanner;

public class Check_Password_Policy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password:- ");
        String pass = sc.next();

        if(pass.length() >= 8 && pass.contains("@")) {
            System.out.println("Password Accepted");
        } else {
            System.out.println("Password Rejected");
        }

        sc.close();
    }
}
