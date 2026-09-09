/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if employee is eligible for bonus based on years of service
*/

import java.util.Scanner;

public class Check_Employee_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input years of service
        System.out.print("Enter years of service:- ");
        int years = sc.nextInt();

        if(years >= 5) {
            System.out.println("Eligible for Bonus");
        } else {
            System.out.println("Not Eligible for Bonus");
        }

        sc.close(); 
    }
}
