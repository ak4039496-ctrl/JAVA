/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Array Average Using Method Overloading
*/

public class array_avg {

    static double average(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    static double average(double[] arr) {

        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        double[] b = {1.5, 2.5, 3.5};

        System.out.println(average(a));

        System.out.println(average(b));
    }
}