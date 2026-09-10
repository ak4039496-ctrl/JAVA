/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if hotel booking qualifies for discount
*/

import java.util.Scanner;

public class Check_Hotel_Booking_Discount {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nights:- ");
        int nights = sc.nextInt();

        if(nights >= 5) {
            System.out.println("Eligible for 20% Discount");
        } else {
            System.out.println("No Discount Available");
        }
    }
}
