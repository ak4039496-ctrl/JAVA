/*
Author: Amit Gupta
Date: 27-Aug-2026
Program: Check if product is eligible for return
*/

import java.util.Scanner;

public class Check_Online_Shopping_Return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter days since purchase:- ");
        int days = sc.nextInt();

        if(days <= 7) {
            System.out.println("Product Eligible for Return");
        } else {
            System.out.println("Return Period Expired");
        }
    }
}
