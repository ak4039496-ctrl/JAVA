/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Array In Reverse Using Recursion
*/

public class arr_reverse {

    // Recursive method
    static void reverse(int[] arr, int index) {

        // Base case
        if (index < 0) {
            return;
        }

        // Print element
        System.out.print(arr[index] + " ");

        // Recursive call
        reverse(arr,index - 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 20, 30, 40, 50};

        reverse(arr,arr.length - 1);
    }
}