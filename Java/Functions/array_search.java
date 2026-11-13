/*
Author: Amit Gupta
Date: 19-Oct-2026
Purpose: Search Element in Array
*/

import java.util.Scanner;

public class array_search {

    // Method to search element
    static boolean search(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print("Enter Search Value: ");
        int key = sc.nextInt();

        if (search(arr, key))
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");

        sc.close();
    }
}