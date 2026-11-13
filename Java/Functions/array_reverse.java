/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Reverse Array Using Method
*/

import java.util.Scanner;

public class array_reverse {

    // Method to print reverse array
    static void reverse(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter Elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        System.out.print("Reversed Array:");

        reverse(arr);

        sc.close();
    }
}