/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Display Messages Using Method Overloading
*/

public class message {

    // Display simple message
    static void message() {

        System.out.println("Welcome");
    }

    // Display personalized message
    static void message(String name) {

        System.out.println("Welcome " + name);
    }

    // Display message multiple times
    static void message(String text,int times) {

        for (int i = 1; i <= times; i++) {

            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        message();

        message("Amit");

        message("Java", 3);
    }
}