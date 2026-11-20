/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Bubble Sort Using Overloading
*/

import java.util.Arrays;

public class bubble_sort {

    static void sort(int[] arr) {

        Arrays.sort(arr);

        System.out.println( Arrays.toString(arr));
    }

    static void sort(char[] arr) {

        Arrays.sort(arr);

        System.out.println( Arrays.toString(arr));
    }

    public static void main(String[] args) {

        sort(new int[]{5,2,8,1});

        sort(new char[]{ 'D','A','C'});
    }
}