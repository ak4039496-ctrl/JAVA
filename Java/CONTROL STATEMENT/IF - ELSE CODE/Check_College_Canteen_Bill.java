/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if student canteen bill exceeds limit
*/

import java.util.Scanner;

public class Check_College_Canteen_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter canteen bill amount:- ");
        double bill = sc.nextDouble();

        if(bill > 500) {
            System.out.println("Bill Exceeds Limit! Please clear dues.");
        } else {
            System.out.println("Bill within limit.");
        }

        sc.close(); 
    }
}
