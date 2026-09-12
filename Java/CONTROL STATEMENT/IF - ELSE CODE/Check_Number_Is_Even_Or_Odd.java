/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if a number is Even or Odd
*/

import java.util.Scanner;

public class Check_Number_Is_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }

        sc.close(); 
    }
}
