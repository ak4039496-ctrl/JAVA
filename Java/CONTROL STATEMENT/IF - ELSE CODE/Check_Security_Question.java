/*
Author: Amit Gupta
Date: 28-Aug-2026
Program: Check security question answer
*/

import java.util.Scanner;

public class Check_Security_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String answer = "Patna";

        System.out.print("Enter your birthplace:- ");
        String entered = sc.next();

        if(entered.equalsIgnoreCase(answer)) {
            System.out.println("Security Question Verified");
        } else {
            System.out.println("Wrong Answer");
        }

        sc.close();
    }
}
