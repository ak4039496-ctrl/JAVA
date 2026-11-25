/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Unique Elements Using Recursion
*/

public class arr_unique {

    static boolean isUnique(int[] arr,int index) {

        for (int i = 0;i < arr.length;i++) {

            if (i != index &&arr[i] == arr[index]) {
                return false;
            }
        }

        return true;
    }

    static void printUnique(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return;
        }

        if (isUnique(arr, index)) {

            System.out.print(arr[index] + " ");
        }

        printUnique(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={1, 2, 2, 3, 4, 4};

        printUnique(arr, 0);
    }
}