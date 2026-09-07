/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Apply discount if bill exceeds threshold
*/

import java.util.Scanner;

public class Check_Bill_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input bill amount
        System.out.print("Enter bill amount:- ");
        double bill = sc.nextDouble();

        if(bill >= 2000) {
            System.out.println("Discount Applied: 10%");
        } else {
            System.out.println("No Discount");
        }

        sc.close(); 
    }
}
