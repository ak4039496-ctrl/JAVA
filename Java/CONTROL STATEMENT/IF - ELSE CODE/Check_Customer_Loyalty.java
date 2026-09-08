/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if customer qualifies for loyalty reward
*/

import java.util.Scanner;

public class Check_Customer_Loyalty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input purchase count
        System.out.print("Enter number of purchases:- ");
        int purchases = sc.nextInt();

        if(purchases >= 10) {
            System.out.println("Customer qualifies for Loyalty Reward");
        } else {
            System.out.println("Customer does not qualify");
        }

        sc.close(); 
    }
}
