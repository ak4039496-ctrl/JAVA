/*
Author: Amit Gupta
Date: 26-Aug-2026
Program: Check user access level based on role
*/

import java.util.Scanner;

public class Check_User_Access_Level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter role (admin/user/guest):- ");
        String role = sc.next();

        if(role.equalsIgnoreCase("admin")) {
            System.out.println("Full Access Granted");
        } else if(role.equalsIgnoreCase("user")) {
            System.out.println("Limited Access Granted");
        } else if(role.equalsIgnoreCase("guest")) {
            System.out.println("Read-Only Access");
        } else {
            System.out.println("Invalid Role");
        }

        sc.close();
    }
}
