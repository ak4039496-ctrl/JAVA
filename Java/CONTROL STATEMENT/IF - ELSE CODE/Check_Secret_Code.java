/*
Author: Amit Gupta
Date: 17-Aug-2026
Program: Check if entered code matches secret code
*/

import java.util.Scanner;

public class Check_Secret_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String secret = "HACk2200";

        System.out.print("Enter code:- ");
        String code = sc.next();

        if(code.equals(secret)) {
            System.out.println("Secret Code Verified");
        } else {
            System.out.println("Invalid Code");
        }

        sc.close();
    }
}
