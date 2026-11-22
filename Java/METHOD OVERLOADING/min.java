/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Minimum Using Overloading
*/

public class min {

    static int minValue(int a, int b) {
        return (a < b) ? a : b;
    }

    static int minValue(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    static int minValue(int[] arr) {

        int min = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] arr = {90, 20, 40, 5};

        System.out.println(minValue(10, 20));

        System.out.println(minValue(10, 20, 5));

        System.out.println(minValue(arr));
    }
}