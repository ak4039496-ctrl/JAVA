/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Maximum Using Overloading
*/

public class max {

    static int maxValue(int a, int b) {

        return (a > b) ? a : b;
    }

    static int maxValue(int a, int b, int c) {

        return Math.max(a, Math.max(b, c));
    }

    static int maxValue(int[] arr) {

        int max = arr[0];

        for (int num : arr) {

            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 80, 40};

        System.out.println(maxValue(10, 20));

        System.out.println(maxValue(10, 20, 30));

        System.out.println(maxValue(arr));
    }
}