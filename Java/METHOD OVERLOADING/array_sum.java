/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Array Sum Using Method Overloading
*/

public class array_sum {

    static int sum(int[] arr) {

        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    static double sum(double[] arr) {

        double sum = 0;

        for (double num : arr) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] a = {10, 20, 30};

        double[] b = {1.5, 2.5, 3.5};

        System.out.println(sum(a));

        System.out.println(sum(b));
    }
}