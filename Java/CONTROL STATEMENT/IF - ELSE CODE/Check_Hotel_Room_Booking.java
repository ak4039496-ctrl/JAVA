/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if hotel room booking is possible based on availability
*/

import java.util.Scanner;

public class Check_Hotel_Room_Booking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter available rooms:- ");
        int rooms = sc.nextInt();

        if(rooms > 0) {
            System.out.println("Room Booking Successful");
        } else {
            System.out.println("No Rooms Available");
        }

        sc.close(); 
    }
}
