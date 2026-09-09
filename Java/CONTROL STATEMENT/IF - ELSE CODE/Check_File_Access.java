/*
Author: Amit Gupta
Date: 18-Aug-2026
Program: Check file access permission
*/

import java.util.Scanner;

public class Check_File_Access {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file type (confidential/public):- ");
        String type = sc.next();

        if(type.equalsIgnoreCase("confidential")) {
            System.out.println("Restricted Access");
        } else {
            System.out.println("Public Access Granted");
        }

        sc.close();
    }
}
