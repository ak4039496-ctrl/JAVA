/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check password strength
*/

import java.util.Scanner;

public class Check_Password_Strength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password:- ");
        String pass = sc.next();

        if(pass.length() >= 8) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }

        sc.close();
    }
}
