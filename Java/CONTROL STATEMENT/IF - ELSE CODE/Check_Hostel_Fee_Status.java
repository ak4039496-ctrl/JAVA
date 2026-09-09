/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Check if hostel fee is paid
*/

import java.util.Scanner;

public class Check_Hostel_Fee_Status {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total fee:- ");
        double totalFee = sc.nextDouble();

        System.out.print("Enter fee paid:- ");
        double paidFee = sc.nextDouble();

        if(paidFee == totalFee) {
            System.out.println("Fee Paid in Full");
        } else {
            System.out.println("Pending Fee: Rs. " + (totalFee - paidFee));
        }

        sc.close(); 
    }
}
