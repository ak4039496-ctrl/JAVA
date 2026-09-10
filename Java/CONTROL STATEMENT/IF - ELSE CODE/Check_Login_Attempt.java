/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Check login attempt with fixed username and password
*/

import java.util.Scanner;

public class Check_Login_Attempt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username:- ");
        String user = sc.next();

        System.out.print("Enter password:- ");
        String pass = sc.next();

        if(user.equals("admin") && pass.equals("12345")) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}
