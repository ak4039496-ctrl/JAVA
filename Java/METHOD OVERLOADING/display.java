/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Display Different Data Types
*/

public class display {

    static void display(int num) {

        System.out.println("Integer: " + num);
    }

    static void display(double num) {

        System.out.println("Double: " + num);
    }

    static void display(String text) {

        System.out.println("String: " + text);
    }

    static void display(boolean value) {

        System.out.println("Boolean: " + value);
    }

    public static void main(String[] args) {

        display(100);

        display(99.5);

        display("Java");

        display(true);
    }
}