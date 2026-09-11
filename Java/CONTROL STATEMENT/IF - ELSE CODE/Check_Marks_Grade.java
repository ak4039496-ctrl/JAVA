/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Assign grade based on marks
*/

import java.util.Scanner;

public class Check_Marks_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        if(marks >= 85) {
            System.out.println("Grade: A");
        } else if(marks >= 60) {
            System.out.println("Grade: B");
        } else if(marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
