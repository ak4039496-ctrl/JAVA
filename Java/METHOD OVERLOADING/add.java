/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Method Overloading Using Different Data Types
*/

public class add {

    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(add(10, 20));

        System.out.println(add(10.5, 20.5));

        System.out.println(add("Hello ", "Java"));
    }
}