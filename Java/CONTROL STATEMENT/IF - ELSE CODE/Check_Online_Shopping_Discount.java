/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if shopping cart qualifies for discount
*/

import java.util.Scanner;

public class Check_Online_Shopping_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total cart value:- ");
        double cartValue = sc.nextDouble();

        if(cartValue >= 1000) {
            System.out.println("Discount Applied: 15%");
        } else {
            System.out.println("No Discount Available");
        }

        sc.close(); 
    }
}
