/*
Author: Amit Gupta
Date: 24-Aug-2026
Program: Simple system login check
*/

import java.util.Scanner;

public class Check_System_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = "root";
        String pass = "toor";

        System.out.print("Enter username:- ");
        String u = sc.next();

        System.out.print("Enter password:- ");
        String p = sc.next();

        if(u.equals(user) && p.equals(pass)) {
            System.out.println("System Login Successful");
        } else {
            System.out.println("System Login Failed");
        }

        sc.close();
    }
}
