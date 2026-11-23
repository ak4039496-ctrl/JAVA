/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Rotate Array Using Method Overloading
*/

public class rotate {

    static void rotate(int[] arr) {

        int temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    static void rotate(char[] arr) {

        char temp = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;

        for(char ch : arr) {
            System.out.print(ch + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        rotate(new int[]{1,2,3,4,5});

        rotate(new char[]{'A','B','C','D'});
    }
}