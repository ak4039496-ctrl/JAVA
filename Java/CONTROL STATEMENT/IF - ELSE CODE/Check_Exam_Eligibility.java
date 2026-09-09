/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if student is eligible for exam based on marks and attendance
*/

import java.util.Scanner;

public class Check_Exam_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        System.out.print("Enter attendance percentage:- ");
        int attendance = sc.nextInt();

        if(marks >= 40 && attendance >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible for Exam");
        }

        sc.close(); 
    }
}
