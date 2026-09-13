/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check OTP verification using if-else
*/

import java.util.Scanner;

public class Check_OTP_Verification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String otp = "4886";

        System.out.print("Enter OTP:- ");
        String entered = sc.next();

        if(entered.equals(otp)) {
            System.out.println("OTP Verified Successfully");
        } else {
            System.out.println("Invalid OTP");
        }

        sc.close();
    }
}
