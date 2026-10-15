/*
Author: Amit Gupta
Date: 05-09-2026
Program: Simple Library Management System
*/

import java.util.Scanner;

public class Library_management_simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] books = {"Java Basics", "C++ Programming", "Python Intro"};
        boolean[] issued = {false, false, false};

        System.out.println("Available Books:");
        for(int i = 0; i < books.length; i++) {
            System.out.println((i+1) + ". " + books[i] + (issued[i] ? " (Issued)" : ""));
        }

        System.out.print("Enter book number to issue: ");
        int choice = sc.nextInt();

        if(choice >= 1 && choice <= books.length && !issued[choice-1]) {
            issued[choice-1] = true;
            System.out.println("Book issued: " + books[choice-1]);
        } else {
            System.out.println("Invalid choice or already issued.");
        }

        sc.close();
    }
}
