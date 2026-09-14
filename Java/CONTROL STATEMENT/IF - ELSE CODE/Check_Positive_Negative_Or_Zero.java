/*
Author: Amit Gupta
Date: 28-Aug-2026
Program: Check if a number is Positive, Negative, or Zero
*/

import java.util.Scanner;

public class Check_Positive_Negative_Or_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println(num + " is Positive");
        } else if(num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("Number is Zero");
        }

        sc.close(); 
    }
}
