/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Number Operations Using Overloading
*/

public class number {

    static boolean check(int num) {

        return num % 2 == 0;
    }

    static boolean check(long num) {

        return num > 0;
    }

    static int check(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println(check(20));

        System.out.println(check(500L));

        System.out.println(check(10, 20));
    }
}