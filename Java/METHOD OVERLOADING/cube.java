/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Cube Using Overloading
*/

public class cube {

    static int cube(int num) {
        return num * num * num;
    }

    static double cube(double num) {
        return num * num * num;
    }

    static long cube(long num) {
        return num * num * num;
    }

    public static void main(String[] args) {

        System.out.println(cube(2));

        System.out.println(cube(2.5));

        System.out.println(cube(4L));
    }
}