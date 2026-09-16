/*
Author: Amit Gupta
Date: 24-Aug-2026
Program: Check if person is eligible to vote
*/

import java.util.Scanner;

public class Check_Voting_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        sc.close();
    }
}
