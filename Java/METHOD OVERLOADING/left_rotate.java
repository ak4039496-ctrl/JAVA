/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Left Rotate Array Using Method Overloading
*/

public class left_rotate {

    static void rotate(int[] arr) {

        int temp = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    static void rotate(String[] arr) {

        String temp = arr[0];

        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

        for(String str : arr) {
            System.out.print(str + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        rotate(new int[]{10,20,30,40});

        rotate(new String[]{"Java","Python","C++"});
    }
}