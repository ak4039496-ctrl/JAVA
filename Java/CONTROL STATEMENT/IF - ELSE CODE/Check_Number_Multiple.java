/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if a number is multiple of 3 or 7
*/

import java.util.Scanner;

public class Check_Number_Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 7 == 0) {
            System.out.println("Number is multiple of both 3 and 7");
        } else if(num % 3 == 0) {
            System.out.println("Number is multiple of 3");
        } else if(num % 7 == 0) {
            System.out.println("Number is multiple of 7");
        } else {
            System.out.println("Number is not multiple of 3 or 7");
        }

        sc.close();
    }
}
