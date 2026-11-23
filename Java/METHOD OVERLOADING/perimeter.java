/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Perimeter Using Method Overloading
*/

public class perimeter {

    static int perimeter(int side) {

        return 4 * side;
    }

    static int perimeter(int length, int width) {

        return 2 * (length + width);
    }

    static double perimeter(double radius) {

        return 2 * 3.14159 * radius;
    }

    public static void main(String[] args) {

        System.out.println(perimeter(5));

        System.out.println(perimeter(10, 20));

        System.out.println(perimeter(7.5));
    }
}