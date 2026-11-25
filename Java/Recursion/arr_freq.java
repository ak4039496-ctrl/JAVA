/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Count Frequency Using Recursion
*/

public class arr_freq {

    // Recursive method
    static int frequency(int[] arr, int key,int index) {

        // Base case
        if (index == arr.length) {
            return 0;
        }

        int count = 0;

        // Check current element
        if (arr[index] == key) {

            count = 1;
        }

        // Recursive case
        return count+frequency(arr,key,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 20, 10, 30,10, 40, 10};

        System.out.println("Frequency = "+ frequency(arr,10,0));
    }
}