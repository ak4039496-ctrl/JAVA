/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Maximum Using Method Overloading
*/

public class array_max {

    static int max(int[] arr) {

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    static double max(double[] arr) {

        double max = arr[0];

        for (double num : arr) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] a = {10, 50, 30};

        double[] b = {5.5, 2.5, 8.5};

        System.out.println(max(a));

        System.out.println(max(b));
    }
}