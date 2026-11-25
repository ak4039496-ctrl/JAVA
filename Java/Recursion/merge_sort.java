/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Merge Sort
*/
import java.util.Arrays;

public class merge_sort {

    static void mergeSort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));

        // Check array data type
        System.out.println(arr.getClass().getSimpleName());
    }
}