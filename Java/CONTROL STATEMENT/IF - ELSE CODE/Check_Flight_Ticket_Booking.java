/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if flight ticket booking is possible based on seat availability
*/

import java.util.Scanner;

public class Check_Flight_Ticket_Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available seats:- ");
        int seats = sc.nextInt();

        if(seats > 0) {
            System.out.println("Booking Successful! Seats left: " + (seats - 1));
        } else {
            System.out.println("Booking Failed! No seats available.");
        }

        sc.close(); 
    }
}
