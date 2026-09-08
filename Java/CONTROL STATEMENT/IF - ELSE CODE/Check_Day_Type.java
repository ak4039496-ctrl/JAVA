/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if day is weekday or weekend
*/

import java.util.Scanner;

public class Check_Day_Type {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day name:- ");
        String day = sc.next();

        if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }

        sc.close();
    }
}
