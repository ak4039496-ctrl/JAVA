/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum Of Squares Using Recursion
*/

public class square_sum {

    // Recursive method
    static int sumSquare(int n) {

        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return (n * n)+ sumSquare(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Square Sum = "+ sumSquare(5));
    }
}