/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Geometry Calculations Using Overloading
*/

public class geometry {

    static int area(int side) {

        return side * side;
    }

    static int area(int length,int width) {

        return length * width;
    }

    static double area(double radius) {

        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println(area(5));

        System.out.println(area(5,10));

        System.out.println(area(7.5));
    }
}