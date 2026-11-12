/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Largest Element in Array
*/

import java.util.Scanner;

public class array_max {

    // Method to find maximum
    static int findMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }

        return max;
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

        System.out.println("Maximum => "+ findMax(arr));

        sc.close();
    }
}