/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Negative Number Using Method Overloading
*/

public class negative {

    static boolean negative(int num) {

        return num < 0;
    }

    static int negative(int[] arr) {

        int count = 0;

        for (int num : arr) {

            if (num < 0) {

                count++;
            }
        }

        return count;
    }

    static void negative(int start,int end) {

        for (int i = start; i <= end; i++) {

            if (i < 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {-5, -8, 4, 10};

        System.out.println(negative(-20));

        System.out.println(negative(arr));

        negative(-20, 5);
    }
}