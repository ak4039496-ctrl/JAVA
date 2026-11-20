/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sort Arrays Using Method Overloading
*/

import java.util.Arrays;
public class array_sort {
    static void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(double[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1};

        double[] b = {5.5, 2.2, 8.8};

        sort(a);

        sort(b);
    }
}