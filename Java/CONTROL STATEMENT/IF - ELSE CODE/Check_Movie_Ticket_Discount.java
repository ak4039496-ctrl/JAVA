/*
Author: Amit Gupta
Date: 22-Aug-2026
Program: Check if person gets movie ticket discount based on age
*/

import java.util.Scanner;

public class Check_Movie_Ticket_Discount {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age:- ");
        int age = sc.nextInt();

        if(age <= 12 || age >= 60) {
            System.out.println("Eligible for Discounted Ticket");
        } else {
            System.out.println("Regular Ticket Price");
        }
    }
}
