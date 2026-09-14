/*
Author: Amit Gupta
Date: 28-Aug-2026
Program: Check result status based on marks
*/

import java.util.Scanner;

public class Check_Result_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        if(marks >= 75) {
            System.out.println("Distinction");
        } else if(marks >= 60) {
            System.out.println("First Division");
        } else if(marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
