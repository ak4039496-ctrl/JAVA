/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sort Array Using Method
*/

import java.util.Scanner;

public class array_sort {

    // Method to sort array
    static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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

        sort(arr);

        System.out.println("Sorted Array:");

        for (int num : arr) {

            System.out.print(num + " ");
        }

        sc.close();
    }
}