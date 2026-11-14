/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Binary Search Using Method
*/

import java.util.Scanner;

public class binary_search {

    static int binarySearch(int[] arr, int key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.print("Enter Search Value: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.println("Found At Index => " + result);
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}