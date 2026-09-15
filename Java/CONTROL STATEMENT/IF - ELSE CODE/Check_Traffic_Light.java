/*
Author: Amit Gupta
Date: 24-Aug-2026
Program: Show action based on traffic light color
*/

import java.util.Scanner;

public class Check_Traffic_Light {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color (Red/Yellow/Green):- ");
        String color = sc.next();

        if(color.equalsIgnoreCase("Red")) {
            System.out.println("Stop");
        } else if(color.equalsIgnoreCase("Yellow")) {
            System.out.println("Ready to Move");
        } else if(color.equalsIgnoreCase("Green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid Color");
        }

        sc.close();
    }
}
