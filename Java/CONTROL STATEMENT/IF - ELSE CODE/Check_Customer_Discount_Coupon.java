/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if customer can use discount coupon
*/

import java.util.Scanner;

public class Check_Customer_Discount_Coupon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount:- ");
        double amount = sc.nextDouble();

        if(amount >= 500) {
            System.out.println("Coupon Applied Successfully");
        } else {
            System.out.println("Coupon Not Applicable");
        }

        sc.close(); 
    }
}
