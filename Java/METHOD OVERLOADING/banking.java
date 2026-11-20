/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Banking Operations Using Method Overloading
*/

public class banking {

    // Cash deposit
    static void deposit(double amount) {

        System.out.println("Cash Deposit = "+ amount);
    }
    // Online deposit
    static void deposit(double amount,String mode) {

        System.out.println( mode +" Deposit = " + amount);
    }

    // Online deposit with reference id
    static void deposit(double amount, String mode, String reference) {

        System.out.println(mode +" Deposit = "+ amount +" Ref: " +reference);
    }

    public static void main(String[] args) {

        deposit(5000);

        deposit(10000,"UPI");

        deposit(15000,"NetBanking","TXN12345");
    }
}