/*
Author: Amit Gupta
Date: 24-Aug-2026
Program: Check if a number is a Perfect Square
*/

import java.util.Scanner;

public class Check_Square_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        int sqrt = (int)Math.sqrt(num);

        if(sqrt * sqrt == num) {
            System.out.println(num + " is a Perfect Square");
        } else {
            System.out.println(num + " is Not a Perfect Square");
        }

        sc.close();
    }
}
