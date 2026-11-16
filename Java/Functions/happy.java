/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Happy Number Using Method
*/

public class happy {

    // Method to calculate digit square sum
    static int squareSum(int num) {

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += digit * digit;

            num /= 10;
        }

        return sum;
    }

    // Method to check happy number
    static boolean isHappy(int num) {

        while (num != 1 && num != 4) {

            num = squareSum(num);
        }

        return num == 1;
    }

    public static void main(String[] args) {

        int num = 19;

        if (isHappy(num))
            System.out.println("Happy Number");
        else
            System.out.println("Not Happy Number");
    }
}