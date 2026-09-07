/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if person is eligible to donate blood
*/

import java.util.Scanner;

public class Check_Blood_Donation_Eligibility {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:- ");
        int age = sc.nextInt();
        System.out.print("Enter weight (kg):- ");
        int weight = sc.nextInt();

        if(age >= 18 && weight >= 50) {
            System.out.println("Eligible to Donate Blood");
        } else {
            System.out.println("Not Eligible to Donate Blood");
        }
    }
}
