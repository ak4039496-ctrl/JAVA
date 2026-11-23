/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Positive Number Using Method Overloading
*/

public class positive {

    static boolean positive(int num) {

        return num > 0;
    }

    static int positive(int[] arr) {

        int count = 0;

        for (int num : arr) {

            if (num > 0) {

                count++;
            }
        }

        return count;
    }

    static void positive(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (i > 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {-5, 2, 6, -1, 10};

        System.out.println(positive(10));

        System.out.println(positive(arr));

        positive(-5, 10);
    }
}