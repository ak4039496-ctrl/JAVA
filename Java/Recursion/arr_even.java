/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Even Elements Using Recursion
*/

public class arr_even {

    // Recursive method
    static void printEven(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return;
        }

        // Print even element
        if (arr[index] % 2 == 0) {

            System.out.print(arr[index] + " ");
        }

        // Recursive call
        printEven(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 15, 20, 25, 30};

        printEven(arr, 0);
    }
}