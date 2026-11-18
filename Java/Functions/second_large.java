/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Second Largest Element
*/

import java.util.Scanner;

public class second_large {

    // Method to find second largest
    static int secondLargest(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {

                second = first;
                first = num;

            } else if (num > second &&num != first) {
                second = num;
            }
        }

        return second;
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

        System.out.println("Second Largest => "+ secondLargest(arr));
        sc.close();
    }
}