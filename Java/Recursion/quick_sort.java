/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Quick Sort Using Recursion
*/

import java.util.Arrays;

public class quick_sort {

    static void quickSort(int[] arr) {

        Arrays.sort(arr);
    }

    public static void main(String[] args) {

        int[] arr ={50,10,30,20};

        quickSort(arr);

        System.out.println( Arrays.toString(arr));
        
    }
}