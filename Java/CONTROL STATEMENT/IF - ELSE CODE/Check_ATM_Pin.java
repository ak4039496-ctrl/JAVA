/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check ATM PIN validation 
*/

import java.util.Scanner;

public class Check_ATM_Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ATM PIN:- ");
        int pin = sc.nextInt();

        if(pin == 1234) {
            System.out.println("PIN Accepted");
        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}
