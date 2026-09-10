/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if internet speed is Fast or Slow
*/

import java.util.Scanner;

public class Check_Internet_Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter internet speed (Mbps):- ");
        int speed = sc.nextInt();

        if(speed >= 50) {
            System.out.println("Fast Internet");
        } else {
            System.out.println("Slow Internet");
        }
    }
}
