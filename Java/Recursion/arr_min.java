/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Minimum Element Using Recursion
*/

public class arr_min {

    // Recursive method
    static int findMin(int[] arr,int index) {

        // Base case
        if (index ==arr.length - 1) {
            return arr[index];
        }

        // Recursive call
        int min =findMin(arr,index + 1);

        return Math.min(arr[index],min);
    }

    public static void main(String[] args) {

        int[] arr ={25, 80, 15, 99, 45};

        System.out.println("Minimum = "+ findMin(arr, 0));
    }
}