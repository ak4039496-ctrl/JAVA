/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Trace Using Overloading
 */

public class matrix_trace {

    static int trace(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];
        }

        return sum;
    }

    static double trace(double[][] arr) {

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(trace(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(trace(new double[][]{
            {1.5, 2.5, 3.5},
            {4.5, 5.5, 6.5},
            {7.5, 8.5, 9.5},
            {7.5, 8.5, 9.5,3.5}
        }));
    }
}
