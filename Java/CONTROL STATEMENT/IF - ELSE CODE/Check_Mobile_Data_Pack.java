/*
Author: Amit Gupta
Date: 21-Aug-2026
Program: Check if mobile data pack is valid
*/

import java.util.Scanner;

public class Check_Mobile_Data_Pack {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data used (GB):- ");
        double used = sc.nextDouble();

        System.out.print("Enter data limit (GB):- ");
        double limit = sc.nextDouble();

        if(used <= limit) {
            System.out.println("Data Pack Active. Remaining: " + (limit - used) + " GB");
        } else {
            System.out.println("Data Limit Exceeded! Please recharge.");
        }
    }
}

