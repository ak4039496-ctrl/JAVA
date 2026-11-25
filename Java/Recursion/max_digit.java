/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Maximum Digit Using Recursion
*/

public class max_digit {

    static int findMax(int num) {

        // Base case
        if (num < 10) {
            return num;
        }

        int digit = num % 10;

        int max =findMax(num / 10);

        return Math.max(digit,max);
    }

    public static void main(String[] args) {

        int num = 583917;

        System.out.println("Maximum Digit => "+ findMax(num));
    }
}