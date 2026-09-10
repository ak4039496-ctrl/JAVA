/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Check if person is eligible for loan based on salary
*/

import java.util.Scanner;

public class Check_Loan_Eligibility {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary:- ");
        double salary = sc.nextDouble();

        if(salary >= 20000) {
            System.out.println("Eligible for Loan");
        } else {
            System.out.println("Not Eligible for Loan");
        }
    }
}
