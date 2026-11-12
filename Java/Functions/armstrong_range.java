/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Armstrong Numbers in Range
*/

public class armstrong_range {

    // Method to check armstrong
    static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += digit * digit * digit;

            num /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            if (isArmstrong(i))
                System.out.print(i + " ");
            
        }
    }
}