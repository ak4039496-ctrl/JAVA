/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Check if a number is Odd
*/

import java.util.Scanner;

public class Check_Number_Is_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 2 != 0) {
            System.out.println(num + " is Odd");
        } else {
            System.out.println(num + " is Not Odd");
        }
    }
}
