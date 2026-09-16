/*
Author: Amit Gupta
Date: 26-Aug-2026
Program: Check if website URL starts with 'https'
*/

import java.util.Scanner;

public class Check_Website_URL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter website URL:- ");
        String url = sc.next();

        if(url.startsWith("https")) {
            System.out.println("Secure Website");
        } else {
            System.out.println("Not Secure Website");
        }

        sc.close();
    }
}
