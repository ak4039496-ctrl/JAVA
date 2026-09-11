/*
Author: Amit Gupta
Date: 21-Aug-2026
Program: Check if mobile recharge is valid based on days
*/

import java.util.Scanner;

public class Check_Mobile_Recharge_Validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter validity days:- ");
        int days = sc.nextInt();

        if(days > 0) {
            System.out.println("Recharge Active for " + days + " days");
        } else {
            System.out.println("Recharge Expired");
        }
    }
}
