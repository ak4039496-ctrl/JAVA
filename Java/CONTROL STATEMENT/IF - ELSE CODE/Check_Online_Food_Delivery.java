/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if food order qualifies for free delivery
*/

import java.util.Scanner;

public class Check_Online_Food_Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order amount:- ");
        double amount = sc.nextDouble();

        if(amount >= 300) {
            System.out.println("Free Delivery Available");
        } else {
            System.out.println("Delivery Charges Apply");
        }

        sc.close();
    }
}
