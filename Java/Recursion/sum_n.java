/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum Of First N Natural Numbers
*/

public class sum_n {

    // Recursive method
    static int sum(int n) {

        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Sum => " + sum(10));
    }
}