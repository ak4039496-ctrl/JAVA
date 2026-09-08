/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if student is eligible for college admission
*/

import java.util.Scanner;

public class Check_College_Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks percentage:- ");
        int marks = sc.nextInt();

        if(marks >= 60) {
            System.out.println("Admission Approved");
        } else {
            System.out.println("Admission Not Approved");
        }

        sc.close(); 
    }
}
