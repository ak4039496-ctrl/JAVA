/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Armstrong Number Using Method
*/

public class armstrong {

    // Method to check Armstrong number
    static boolean isArmstrong(int num) {

        // Store original number
        int original = num;

        // Store digit power sum
        int sum = 0;

        // Calculate cube sum
        while (num > 0) {

            // Extract digit
            int digit = num % 10;

            // Add cube of digit
            sum += digit * digit * digit;

            // Remove digit
            num /= 10;
        }

        // Compare values
        return original == sum;
    }

    public static void main(String[] args) {

        // Given number
        int num = 153;

        // Check Armstrong
        if (isArmstrong(num))
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is Not Armstrong");
    }
}