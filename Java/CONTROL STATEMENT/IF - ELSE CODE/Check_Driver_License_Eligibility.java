/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if person is eligible for driving license
*/

import java.util.Scanner;

public class Check_Driver_License_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input age
        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Eligible for Driving License");
        } else {
            System.out.println("Not Eligible for Driving License");
        }

        sc.close(); 
    }
}
