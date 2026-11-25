/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Second Largest Element Using Recursion
*/

public class second_large {

    static int first = Integer.MIN_VALUE;
    static int second = Integer.MIN_VALUE;

    // Recursive method
    static void findSecondLargest(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return;
        }

        // Update largest values
        if (arr[index] > first) {

            second = first;
            first = arr[index];
        }
        else if (arr[index] > second&& arr[index] != first) {
            second = arr[index];
        }

        // Recursive call
        findSecondLargest(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 80, 40, 90, 70};

        findSecondLargest(arr, 0);

        System.out.println("Second Largest = "+ second);
    }
}