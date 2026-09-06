/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if user has admin access
*/

import java.util.Scanner;

public class Check_Admin_Access {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter role:- ");
        String role = sc.next();

        if(role.equalsIgnoreCase("admin")) {
            System.out.println("Access Granted: Full Control");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}
