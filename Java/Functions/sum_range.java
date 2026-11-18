/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Sum of Numbers in Range Using Method
*/

public class sum_range {

    // Method to calculate sum
    static int findSum(int start, int end) {

        // Store sum
        int sum = 0;

        // Traverse range
        for (int i = start; i <= end; i++) {

            // Add current number
            sum += i;
        }

        // Return result
        return sum;
    }

    public static void main(String[] args) {

        // Method call
        int result = findSum(1, 10);

        // Display result
        System.out.println("Sum = " + result);
    }
}