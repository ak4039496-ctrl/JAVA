/*
Author: Amit Gupta
Date: 22-Aug-2026
Program: Check if mobile number is valid (10 digits)
*/

import java.util.Scanner;

public class Check_Mobile_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number:- ");
        String mob = sc.next();

        if(mob.length() == 10) {
            System.out.println("Valid Mobile Number");
        } else {
            System.out.println("Invalid Mobile Number");
        }

        sc.close();
    }
}
