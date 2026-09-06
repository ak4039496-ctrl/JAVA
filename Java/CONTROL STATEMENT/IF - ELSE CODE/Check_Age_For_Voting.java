/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if person is eligible to vote
*/

import java.util.Scanner;

public class Check_Age_For_Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }
    }
}
