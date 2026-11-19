/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse Arrays Using Method Overloading
*/

public class array_reverse {

    static void reverse(int[] arr) {

        for (int i = arr.length - 1;i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(String[] arr) {

        for (int i = arr.length - 1;i >= 0; i--) {

            System.out.print( arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        reverse(new int[]{1,2,3,4});
        reverse(new String[]{"Java","Python","C++"});
    }
}