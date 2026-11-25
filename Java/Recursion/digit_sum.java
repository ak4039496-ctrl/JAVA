/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum Of Digits Using Recursion
*/

public class digit_sum {

    // Recursive method
    static int digitSum(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        // Recursive case
        return (num % 10)+ digitSum(num / 10);
    }

    public static void main(String[] args) {

        System.out.println(digitSum(12345));
    }
}