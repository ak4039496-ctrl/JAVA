/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Odd Elements Using Recursion
*/

public class arr_odd {

    // Recursive method
    static void printOdd( int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return;
        }

        // Print odd element
        if (arr[index] % 2 != 0) {

            System.out.print(arr[index] + " ");
        }

        // Recursive call
        printOdd(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30};

        printOdd(arr, 0);
    }
}