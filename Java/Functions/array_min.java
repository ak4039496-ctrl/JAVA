/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Smallest Element in Array Using Method
*/

import java.util.Scanner;

public class array_min {

    // Method to find minimum element
    static int findMin(int[] arr) {

        // Assume first element is minimum
        int min = arr[0];

        // Compare remaining elements
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        // Return minimum value
        return min;
    }

    public static void main(String[] args) {

        // Create scanner object
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        // Validate size
        if (n <= 0) {

            System.out.println("Invalid Array Size");
            return;
        }

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter Array Elements:");

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Method call
        int minValue = findMin(arr);

        // Display result
        System.out.println("Minimum Element => "+ minValue);

        // Close scanner
        sc.close();
    }
}