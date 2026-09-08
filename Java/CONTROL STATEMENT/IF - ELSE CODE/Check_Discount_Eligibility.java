/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if customer is eligible for discount based on purchase amount
*/

import java.util.Scanner;

public class Check_Discount_Eligibility {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount:- ");
        double amount = sc.nextDouble();

        if(amount >= 1000) {
            System.out.println("Eligible for 10% Discount");
        } else {
            System.out.println("Not Eligible for Discount");
        }
    }
}
