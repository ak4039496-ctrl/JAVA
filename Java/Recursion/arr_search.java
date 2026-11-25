/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Search Element In Array Using Recursion
*/

public class arr_search {

    // Recursive method
    static boolean search(int[] arr,int key,int index) {

        // Base case
        if (index == arr.length) {
            return false;
        }

        // Element found
        if (arr[index] == key) {
            System.out.println("INDEX : "+ index +" pr hai");
            return true;
            
        }

        // Recursive call
        return search(arr,key,index + 1);
    }

    public static void main(String[] args) {

        int[] arr ={10, 20, 30, 40, 50};

        System.out.println(search(arr, 30, 0));
    }
}