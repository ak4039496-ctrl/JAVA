/*
Author: Amit Gupta
Date: 23-Aug-2026
Program: Check if a number is multiple of 5 or 7
*/

import java.util.Scanner;

public class Check_Multiple_Of_Five_Or_Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 5 == 0 || num % 7 == 0) {
            System.out.println(num + " is a Multiple of 5 or 7");
        } else {
            System.out.println(num + " is Not a Multiple of 5 or 7");
        }

        sc.close();
    }
}
