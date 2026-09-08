/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check if electricity bill has surcharge
*/

import java.util.Scanner;

public class Check_Electricity_Bill_Surcharge {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed:- ");
        int units = sc.nextInt();

        if(units > 500) {
            System.out.println("Surcharge Applied");
        } else {
            System.out.println("No Surcharge");
        }
    }
}
