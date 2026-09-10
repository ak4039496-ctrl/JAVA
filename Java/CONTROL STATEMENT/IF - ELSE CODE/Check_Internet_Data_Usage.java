/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if internet data usage exceeded limit
*/

import java.util.Scanner;

public class Check_Internet_Data_Usage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter data limit (GB):- ");
        double limit = sc.nextDouble();

        System.out.print("Enter data used (GB):- ");
        double used = sc.nextDouble();

        if(used <= limit) {
            System.out.println("Data Pack Active. Remaining:- " + (limit - used) + " GB");
        } else {
            System.out.println("Data Limit Exceeded! Please recharge.");
        }

        sc.close(); 
    }
}
