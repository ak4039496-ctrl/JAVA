/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if student can login to online exam based on roll number
*/

import java.util.Scanner;

public class Check_Online_Exam_Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number:- ");
        int roll = sc.nextInt();

        if(roll > 0 && roll <= 500) {
            System.out.println("Login Successful for Roll No:- " + roll);
        } else {
            System.out.println("Invalid Roll Number");
        }
    }
}
