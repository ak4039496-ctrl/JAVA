/*
Author: Amit Gupta
Date: 05-09-2026
Program: Student Marksheet Generator
*/

import java.util.Scanner;

public class Student_marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double avg = total / 3.0;

        System.out.println("\n--- Marksheet ---");
        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if(avg >= 75) System.out.println("Grade: Distinction");
        else if(avg >= 60) System.out.println("Grade: First Class");
        else if(avg >= 40) System.out.println("Grade: Pass");
        else System.out.println("Grade: Fail");

        sc.close();
    }
}
