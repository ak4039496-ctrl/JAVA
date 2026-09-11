/*
Author: Amit Gupta
Date: 22-Aug-2026
Program: Check if a number is Multiple of 8
*/

import java.util.Scanner;

public class Check_Multiple_Of_Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 8 == 0) {
            System.out.println(num + " is a Multiple of 8");
        } else {
            System.out.println(num + " is Not a Multiple of 8");
        }

        sc.close(); 
    }
}
