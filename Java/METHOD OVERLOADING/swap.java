/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Swap Values Using Overloading
*/

public class swap {

    static void swap(int a, int b) {

        System.out.println("Before: "+ a + " " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After: "+ a + " " + b);
    }

    static void swap(char a, char b) {

        System.out.println("Before: "+ a + " " + b);

        char temp = a;
        a = b;
        b = temp;

        System.out.println("After: "+ a + " " + b);
    }

    public static void main(String[] args) {

        swap(10, 20);

        swap('A', 'B');
    }
}