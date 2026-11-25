/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Array Average Using Recursion
*/

public class arr_avg {

    // Recursive sum method
    static int findSum(int[] arr,int index) {

        // Base case
        if (index == arr.length) {
            return 0;
        }

        return arr[index]+findSum(arr,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 20, 30, 40, 50};

        int sum =findSum(arr, 0);

        double avg =(double) sum/ arr.length;

        System.out.println("Average => "+ avg);
    }
}