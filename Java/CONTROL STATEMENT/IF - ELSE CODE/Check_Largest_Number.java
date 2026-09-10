/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Find the largest number among two numbers
*/

import java.util.Scanner;

public class Check_Largest_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:- ");
        int a = sc.nextInt();

        System.out.print("Enter second number:- ");
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("Largest Number:- " + a);
        } else {
            System.out.println("Largest Number:- " + b);
        }

        sc.close();
    }
}
