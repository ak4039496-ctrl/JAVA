/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check exam result based on marks
*/

import java.util.Scanner;

public class Check_Exam_Result {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        if(marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
