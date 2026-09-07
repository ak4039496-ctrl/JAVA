/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if bank loan can be approved based on salary and credit score
*/

import java.util.Scanner;

public class Check_Bank_Loan_Approval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary:- ");
        double salary = sc.nextDouble();

        System.out.print("Enter credit score:- ");
        int score = sc.nextInt();

        if(salary >= 30000 && score >= 700) {
            System.out.println("Loan Approved");
        } else {
            System.out.println("Loan Not Approved");
        }

        sc.close(); 
    }
}
