/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Minimum Digit Using Recursion
*/

public class min_digit {

    static int findMin(int num) {

        // Base case
        if (num < 10) {
            return num;
        }

        int digit = num % 10;

        int min =findMin(num / 10);

        return Math.min(digit,min);
    }

    public static void main(String[] args) {

        int num = 583917;

        System.out.println("Minimum Digit => "+ findMin(num));
    }
}