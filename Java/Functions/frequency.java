/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Frequency of Element
*/

import java.util.Scanner;

public class frequency {

    // Method to count frequency
    static int countFreq(int[] arr, int key) {

        int count = 0;

        for (int num : arr) {

            if (num == key) {

                count++;
            }
        }

        return count;
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

        System.out.print("Enter Element: ");
        int key = sc.nextInt();

        System.out.println("Frequency = " + countFreq(arr, key));

        sc.close();
    }
}