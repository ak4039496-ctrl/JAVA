/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Duplicate Elements Using Recursion
*/

public class arr_dup {

    static void printDuplicate(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return;
        }

        for (int i = index + 1;i < arr.length;i++) {

            if (arr[index]== arr[i]) {

                System.out.print(arr[index] + " ");
                break;
            }
        }

        printDuplicate(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 7, 3, 4, 4,2};

        printDuplicate(arr, 0);
    }
}