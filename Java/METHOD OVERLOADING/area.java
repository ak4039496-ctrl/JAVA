/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Area Using Method Overloading
*/

public class area {

    static int area(int side) {

        return side * side;
    }

    static int area(int length, int width) {

        return length * width;
    }

    static double area(double radius) {

        return 3.14159 * radius * radius;
    }

    static double area(double base,double height) {
       return 0.5 * base * height;
    }

    public static void main(String[] args) {

        System.out.println(area(5));

        System.out.println(area(10, 20));

        System.out.println(area(7.5));

        System.out.println(area(10.0, 5.0));
    }
}