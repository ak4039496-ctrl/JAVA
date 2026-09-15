/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if student is eligible for exam based on attendance
*/

import java.util.Scanner;

public class Check_Student_Attendance_Eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes:- ");
        int total = sc.nextInt();

        System.out.print("Enter attended classes:- ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / total;

        if(percentage >= 75) {
            System.out.println("Eligible for Exam (Attendance: " + percentage + "%)");
        } else {
            System.out.println("Not Eligible (Attendance: " + percentage + "%)");
        }

        sc.close(); 
    }
}
