/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if online payment is successful based on balance
*/

import java.util.Scanner;

public class Check_Online_Payment_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance:- ");
        double balance = sc.nextDouble();

        System.out.print("Enter payment amount:- ");
        double payment = sc.nextDouble();

        if(payment <= balance) {
            System.out.println("Payment Successful! Remaining Balance: " + (balance - payment));
        } else {
            System.out.println("Payment Failed! Insufficient Balance.");
        }

        sc.close(); 
    }
}
