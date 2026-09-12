/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if a number is Positive
*/

import java.util.Scanner;

public class Check_Number_Is_Positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println(num + " is Positive");
        } else {
            System.out.println(num + " is Not Positive");
        }
    }
}
