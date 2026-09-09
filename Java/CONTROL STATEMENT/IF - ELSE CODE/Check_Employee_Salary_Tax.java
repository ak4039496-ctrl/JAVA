/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if employee salary is taxable
*/

import java.util.Scanner;

public class Check_Employee_Salary_Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly salary:- ");
        double salary = sc.nextDouble();

        if(salary >= 25000) {
            System.out.println("Salary is Taxable");
        } else {
            System.out.println("Salary is Not Taxable");
        }

        sc.close(); 
    }
}
