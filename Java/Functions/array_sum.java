/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Sum of Array Elements Using Method
*/

import java.util.Scanner;

public class array_sum {

    // Method to calculate array sum
    static int findSum(int[] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
        }

        return sum;
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

        System.out.println("Sum => " +findSum(arr));
        sc.close();
    }
}