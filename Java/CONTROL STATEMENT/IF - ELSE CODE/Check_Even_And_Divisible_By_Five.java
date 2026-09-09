/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if a number is Even and Divisible by 5
*/

import java.util.Scanner;

public class Check_Even_And_Divisible_By_Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:- ");
        int num = sc.nextInt();

        if(num % 2 == 0 && num % 5 == 0) {
            System.out.println(num + " is Even and Divisible by 5");
        } else {
            System.out.println(num + " does not satisfy both conditions");
        }

        sc.close(); 
    }
}
