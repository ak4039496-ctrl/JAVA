/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if a number is Negative
*/

import java.util.Scanner;

public class Check_Number_Is_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println(num + " is Not Negative");
        }
    }
}
