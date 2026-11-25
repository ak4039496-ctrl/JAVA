/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Product Of Array Elements Using Recursion
*/

public class arr_product {

    // Recursive method
    static int product(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return 1;
        }

        // Recursive case
        return arr[index] *product(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={2, 3, 4, 5};

        System.out.println("Product = "+ product(arr, 0));
    }
}