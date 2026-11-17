/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Perfect Number Using Method
*/

public class perfect {

    // Method to check perfect number
    static boolean isPerfect(int num) {

        // Store factors sum
        int sum = 0;

        // Find factors
        for (int i = 1; i < num; i++) {

            // Check factor
            if (num % i == 0) {

                // Add factor
                sum += i;
            }
        }

        // Compare number and factor sum
        return sum == num;
    }

    public static void main(String[] args) {

        // Given number
        int num = 28;

        // Method call
        if (isPerfect(num))
            System.out.println(num + " is Perfect");
        else
            System.out.println(num + " is Not Perfect");
    }
}