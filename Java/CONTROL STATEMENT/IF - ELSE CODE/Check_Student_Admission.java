/*
Author: Amit Gupta
Date: 13-Aug-2026
Program: Check if student is eligible for admission based on marks
*/

import java.util.Scanner;

public class Check_Student_Admission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        if(marks >= 60) {
            System.out.println("Admission Approved");
        } else {
            System.out.println("Admission Not Approved");
        }

        sc.close(); 
    }
}
