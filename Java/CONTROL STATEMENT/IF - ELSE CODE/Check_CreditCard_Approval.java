/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if customer is eligible for credit card
*/

import java.util.Scanner;

public class Check_CreditCard_Approval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income:- ");
        double income = sc.nextDouble();

        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(income >= 20000 && age >= 21) {
            System.out.println("Credit Card Approved");
        } else {
            System.out.println("Credit Card Not Approved");
        }

        sc.close();
    }
}
