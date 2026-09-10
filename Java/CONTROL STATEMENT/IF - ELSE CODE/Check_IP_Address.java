/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if IP address format is valid (contains '.')
*/

import java.util.Scanner;

public class Check_IP_Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP Address:- ");
        String ip = sc.next();

        if(ip.contains(".")) {
            System.out.println("Valid IP Format");
        } else {
            System.out.println("Invalid IP Format");
        }

        sc.close();
    }
}
