/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if student passed online exam
*/

import java.util.Scanner;

public class Check_Online_Exam_Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        if(marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close(); 
    }
}
