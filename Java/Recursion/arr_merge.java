/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Merge Two Arrays Using Recursion
*/

public class arr_merge {

    // Recursive merge method
    static void merge(int[] arr1,int[] arr2,int[] result,int index) {

        // Copy first array
        if (index < arr1.length) {

            result[index] =arr1[index];

            merge(arr1,arr2,result,index + 1);
        }

        // Copy second array
        else if (index <arr1.length +arr2.length) {

            result[index] =arr2[index -arr1.length];

            merge(arr1,arr2,result,index + 1);
        }
    }

    public static void main(String[] args) {

        int[] arr1 ={1, 2, 3};

        int[] arr2 ={4, 5, 6};

        int[] result =new int[arr1.length +arr2.length];

        merge(arr1,arr2,result,0);

        for (int num : result) {

            System.out.print(num + " ");
        }
    }
}