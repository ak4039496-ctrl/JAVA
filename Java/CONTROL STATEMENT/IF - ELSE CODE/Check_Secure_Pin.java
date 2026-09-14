/*
Author: Amit Gupta
Date: 25-Aug-2026
Program: Check if PIN is secure (must be 6 digits)
*/

import java.util.Scanner;

public class Check_Secure_Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN:- ");
        String pin = sc.next();

        if(pin.length() == 6) {
            System.out.println("Secure PIN Accepted");
        } else {
            System.out.println("Invalid PIN Length");
        }

        sc.close();
    }
}
