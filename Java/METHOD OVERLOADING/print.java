/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Different Values Using Overloading
*/

public class print {

    static void printValue(int num) {

        System.out.println(num);
    }

    static void printValue(String name) {

        System.out.println(name);
    }

    static void printValue(int[] arr) {

        for (int num : arr) {

            System.out.print(num + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        printValue(500);

        printValue("Amit Gupta");

        printValue(arr);
    }
}