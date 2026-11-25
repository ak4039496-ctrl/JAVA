/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sort Array Using Recursive Bubble Sort
*/

public class arr_sort {

    // Recursive bubble sort
    static void sort(int[] arr,int n) {

        // Base case
        if (n == 1) {
            return;
        }

        // One pass
        for (int i = 0;i < n - 1;i++) {

            if (arr[i] >arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call
        sort(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {5, 2, 8, 1, 9};

        sort(arr,arr.length);

        for (int num : arr) {

            System.out.print(num + " ");
        }
    }
}
