/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Utility Methods Using Overloading
*/

public class utility {

    static void print(int num) {

        System.out.println("Integer : " + num);
    }

    static void print(double num) {

        System.out.println("Double : " + num);
    }

    static void print(String text) {

        System.out.println("String : " + text);
    }

    static void print(boolean value) {

        System.out.println("Boolean : " + value);
    }

    public static void main(String[] args) {

        print(100);

        print(99.99);

        print("Java");

        print(true);
    }
}