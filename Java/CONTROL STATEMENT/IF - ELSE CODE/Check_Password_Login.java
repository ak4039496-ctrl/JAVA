/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check login with fixed password
*/

import java.util.Scanner;

public class Check_Password_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password:- ");
        String pass = sc.next();

        if(pass.equals("lolo123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}
