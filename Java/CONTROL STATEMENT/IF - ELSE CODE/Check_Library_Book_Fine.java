/*
Author: Amit Gupta
Date: 19-Aug-2026
Program: Calculate library fine based on late days
*/

import java.util.Scanner;

public class Check_Library_Book_Fine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of late days:- ");
        int days = sc.nextInt();

        if(days == 0) {
            System.out.println("No Fine");
        } else if(days <= 5) {
            System.out.println("Fine=> Rs. " + (days * 2));
        } else {
            System.out.println("Fine => Rs. " + (days * 5));
        }

        sc.close(); 
    }
}
