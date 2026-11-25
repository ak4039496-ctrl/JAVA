/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Second Smallest Element Using Recursion
*/

public class second_small {

    static int first = Integer.MAX_VALUE;
    static int second = Integer.MAX_VALUE;

    // Recursive method
    static void findSecondSmallest(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return;
        }

        if (arr[index] < first) {

            second = first;
            first = arr[index];
        }
        else if (arr[index] < second&& arr[index] != first) {

            second = arr[index];
        }

        findSecondSmallest(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 80, 5, 90, 20};

        findSecondSmallest(arr, 0);

        System.out.println("Second Smallest = "+ second);
    }
}