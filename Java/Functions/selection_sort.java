/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Selection Sort Using Method
*/



public class selection_sort {

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {50, 20, 10, 40, 30};

        selectionSort(arr);

        for (int num : arr) {

            System.out.print(num + " ");
        }

    }
}