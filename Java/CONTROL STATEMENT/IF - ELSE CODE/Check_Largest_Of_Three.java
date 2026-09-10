/*
Author: Amit Gupta
Date: 20-Aug-2026
Program: Find the largest of three numbers 
*/

import java.util.Scanner;

public class Check_Largest_Of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();
        System.out.print("Enter third number:- ");
        int c = sc.nextInt();

        // if-else ladder to find largest
        if(a >= b && a >= c) {
            System.out.println(a + " is Largest");
        } else if(b >= c) {
            System.out.println(b + " is Largest");
        } else {
            System.out.println(c + " is Largest");
        }

        sc.close();
    }
}
