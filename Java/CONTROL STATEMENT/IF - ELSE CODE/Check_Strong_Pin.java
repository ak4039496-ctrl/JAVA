/*
Author: Amit Gupta
Date: 29-Aug-2026
Program: Check if PIN is strong (length >= 4)
*/

import java.util.Scanner;

public class Check_Strong_Pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PIN:- ");
        String pin = sc.next();

        if(pin.length() >= 4) {
            System.out.println("Strong PIN");
        } else {
            System.out.println("Weak PIN");
        }

        sc.close();
    }
}
