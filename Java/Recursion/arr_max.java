/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Maximum Element Using Recursion
*/

public class arr_max {

    // Recursive method
    static int findMax(int[] arr,int index) {

        // Base case
        if (index ==arr.length - 1) {

            return arr[index];
        }

        // Recursive call
        int max =findMax(arr,index + 1);

        return Math.max(arr[index],max);
    }

    public static void main(String[] args) {

        int[] arr ={25, 80, 15, 99, 45};

        System.out.println("Maximum = "+ findMax(arr, 0));
    }
}