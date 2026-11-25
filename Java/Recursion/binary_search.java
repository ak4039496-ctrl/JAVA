/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Binary Search Using Recursion
*/

public class binary_search {

    static int search(int[] arr,int left,int right,int key) {

        if (left > right) {
            return -1;
        }

        int mid =(left + right) / 2;

        if (arr[mid] == key) {
            return mid;
        }

        if (key < arr[mid]) {

            return search(arr,left,mid - 1,key);
        }

        return search(arr,mid + 1,right,key);
    }

    public static void main(String[] args) {

        int[] arr ={10,20,30,40,50};

        System.out.println(search(arr, 0,arr.length - 1,40));
    }
}