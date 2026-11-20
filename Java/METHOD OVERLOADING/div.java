/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Division Using Overloading
*/

public class div {

    static int divide(int a, int b) {
        return a / b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double divide(int total, int count, boolean average) {

        return (double) total / count;
    }

    public static void main(String[] args) {

        System.out.println(divide(20, 5));

        System.out.println(divide(22.5, 2.5));

        System.out.println(divide(100, 5, true));
    }
}