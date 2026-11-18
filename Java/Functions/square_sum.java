/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum of Squares Using Method
*/

public class square_sum {

    // Method to find square
    static int square(int num) {

        return num * num;
    }

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += square(i);
        }

        System.out.println("Square Sum = " + sum);
    }
}