/*
Author: Amit Gupta
Date: 16-Aug-2026
Program: Check if a number is divisible by both 2 and 3
*/

import java.util.Scanner;

public class Check_Divisible_By_Two_And_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + " is divisible by both 2 and 3");
        } else {
            System.out.println(num + " is not divisible by both 2 and 3");
        }

        sc.close();
    }
}
