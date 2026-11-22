/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Method Overloading Using Different Numeric Types
*/

public class mul {

    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static float multiply(float a, float b) {
        return a * b;
    }

    public static void main(String[] args) {

        System.out.println(multiply(5, 6));

        System.out.println(multiply(5.5, 2.0));

        System.out.println(multiply(2.5f, 4.0f));
    }
}