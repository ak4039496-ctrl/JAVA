/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if account balance is sufficient
*/

import java.util.Scanner;

public class Check_Bank_Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance:- ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount:- ");
        int withdraw = sc.nextInt();

        if(withdraw <= balance) {
            System.out.println("Transaction Successful");
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
