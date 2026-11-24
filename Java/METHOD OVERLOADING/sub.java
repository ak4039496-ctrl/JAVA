/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Method Overloading Using Different Arguments
*/

public class sub {

    static int subtract(int a, int b) {
        return a - b;
    }

    static int subtract(int a, int b, int c) {
        return a - b - c;
    }

    static int subtract(int a, int b, int c, int d) {
        return a - b - c - d;
    }

    public static void main(String[] args) {

        System.out.println(subtract(50, 10));

        System.out.println(subtract(100, 20, 10));

        System.out.println(subtract(200, 20, 10, 5));
    }
}