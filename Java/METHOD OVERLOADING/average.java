/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Average Using Method Overloading
*/

public class average {

    // Average of two numbers
    static int average(int a, int b) {

        return (a + b) / 2;
    }

    // Average of three numbers
    static double average(int a,int b,int c) {
        return (a + b + c) / 3.0;
    }
    // Average of array elements
    static double average(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        System.out.println(average(10, 20));

        System.out.println(average(10, 20, 30));

        System.out.println(average(arr));
    }
}