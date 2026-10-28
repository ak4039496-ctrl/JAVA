// Author: Amit Gupta
// Date: 03-09-2026
// Program: Calculate average marks and grade 

import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = 5; // total subjects
        int i = 1;
        int total = 0;

        while (i <= subjects) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total += marks;
            i++;
        }

        double avg = total / (double)subjects;
        System.out.println("Average Marks = " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+");
        } else if (avg >= 75) {
            System.out.println("Grade: A");
        } else if (avg >= 50) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
