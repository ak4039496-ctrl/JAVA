/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if a number is Zero or Not
*/

import java.util.Scanner;

public class Check_Number_Is_Zero_Or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num == 0) {
            System.out.println("Number is Zero");
        } else {
            System.out.println("Number is Not Zero");
        }

        sc.close(); 
    }
}
