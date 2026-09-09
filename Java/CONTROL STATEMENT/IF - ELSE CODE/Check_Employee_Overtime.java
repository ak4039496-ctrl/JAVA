/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Calculate overtime pay if employee works more than 8 hours
*/

import java.util.Scanner;

public class Check_Employee_Overtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter working hours:- ");
        int hours = sc.nextInt();

        if(hours > 8) {
            int overtime = hours - 8;
            System.out.println("Overtime Pay for " + overtime + " hours");
        } else {
            System.out.println("No Overtime");
        }

        sc.close(); 
    }
}
