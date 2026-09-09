/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Assign grade based on marks 
*/

import java.util.Scanner;

public class Check_Grade_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks:- ");
        int marks = sc.nextInt();

        if(marks >= 90) {
            System.out.println("Grade: A");
        } else if(marks >= 75) {
            System.out.println("Grade: B");
        } else if(marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
