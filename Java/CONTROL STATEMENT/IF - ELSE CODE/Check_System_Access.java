/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check system access based on key
*/

import java.util.Scanner;

public class Check_System_Access {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String key = "LOLOPOLO145";

        System.out.print("Enter system key:- ");
        String entered = sc.next();

        if(entered.equals(key)) {
            System.out.println("System Access Granted");
        } else {
            System.out.println("System Access Denied");
        }

        sc.close();
    }
}
