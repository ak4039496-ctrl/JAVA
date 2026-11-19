/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Minimum Using Method Overloading
*/

public class array_min {

    static int min(int[] arr) {

        int min = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    static double min(double[] arr) {

        double min = arr[0];

        for (double num : arr) {

            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] a = {10, 50, 5};

        double[] b = {1.2, 5.6, 0.5};

        System.out.println(min(a));

        System.out.println(min(b));
    }
}