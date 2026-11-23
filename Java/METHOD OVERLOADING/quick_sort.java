/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Quick Sort Using Method Overloading
*/

public class quick_sort {

    static void sort(int[] arr) {

        java.util.Arrays.sort(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    static void sort(char[] arr) {

        java.util.Arrays.sort(arr);

        for(char ch : arr) {
            System.out.print(ch + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        sort(new int[]{5,2,8,1});

        sort(new char[]{'D','A','C'});
    }
}