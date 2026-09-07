/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if ATM withdrawal is possible based on balance
*/

import java.util.Scanner;

public class Check_ATM_Withdrawal {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance:- ");
        double balance = sc.nextDouble();

        System.out.print("Enter withdrawal amount:- ");
        double withdraw = sc.nextDouble();

        if(withdraw <= balance) {
            System.out.println("Transaction Successful! Remaining Balance: " + (balance - withdraw));
        } else {
            System.out.println("Insufficient Balance. Transaction Failed.");
        }
    }
}
