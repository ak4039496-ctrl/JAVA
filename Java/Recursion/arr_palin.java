/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Palindrome Array Using Recursion
*/

public class arr_palin {

    static boolean isPalindrome(int[] arr,int start,int end) {

        // Base case
        if (start >= end) {
            return true;
        }

        // Check mismatch
        if (arr[start]!= arr[end]) {

            return false;
        }

        // Recursive call
        return isPalindrome(arr,start + 1,end - 1);
    }

    public static void main(String[] args) {

        int[] arr ={1, 2, 3, 2, 1};

        System.out.println(isPalindrome(arr,0,arr.length - 1));
    }
}