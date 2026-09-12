/*
Author: Amit Gupta
Date: 23-Aug-2026
Program: Check if a number is Multiple of 2 or 5
*/

import java.util.Scanner;

public class Check_Multiple_Of_Two_Or_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 2 == 0 || num % 5 == 0) {
            System.out.println(num + " is a Multiple of 2 or 5");
        } else {
            System.out.println(num + " is Not a Multiple of 2 or 5");
        }

        sc.close(); 
    }
}
