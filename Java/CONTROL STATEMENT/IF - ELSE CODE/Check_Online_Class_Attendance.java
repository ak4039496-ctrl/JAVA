/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if student has minimum attendance for exam
*/

import java.util.Scanner;

public class Check_Online_Class_Attendance {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total classes:- ");
        int total = sc.nextInt();

        System.out.print("Enter attended classes:- ");
        int attended = sc.nextInt();

        double percentage = (attended * 100.0) / total;

        if(percentage >= 75) {
            System.out.println("Allowed for Exam (Attendance: " + percentage + "%)");
        } else {
            System.out.println("Not Allowed (Attendance: " + percentage + "%)");
        }
    }
}
