/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Even Number Using Method Overloading
*/

public class even {

    // Check single number
    static boolean even(int num) {

        return num % 2 == 0;
    }

    // Print even numbers in range
    static void even(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (even(i)) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // Count even numbers in array
    static int even(int[] arr) {

        int count = 0;

        for (int num : arr) {

            if (num % 2 == 0) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {10, 11, 12, 15, 20};

        System.out.println(even(20));

        even(1, 20);

        System.out.println(even(arr));
    }
}