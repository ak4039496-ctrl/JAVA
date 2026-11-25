/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Array Sum Using Recursion
*/

public class arr_sum {

    // Recursive method
    static int findSum(int[] arr, int index) {

        // Base case
        if (index == arr.length) {
            return 0;
        }

        // Recursive case
        return arr[index] +findSum(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 20, 30, 40, 50};

        System.out.println("Sum = "+ findSum(arr, 0));
    }
}