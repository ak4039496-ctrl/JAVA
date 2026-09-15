/*
Author: Amit Gupta
Date: 23-Aug-2026
Program: Check if train ticket reservation is possible
*/

import java.util.Scanner;

public class Check_Train_Ticket_Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available seats:- ");
        int seats = sc.nextInt();

        if(seats > 0) {
            System.out.println("Reservation Successful");
        } else {
            System.out.println("Reservation Failed - No Seats Available");
        }

        sc.close(); 
    }
}
