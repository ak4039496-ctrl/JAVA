/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Factorial Using Recursion
*/

public class fact {

    // Recursive factorial method
    static long factorial(int n) {

        // Base case
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Factorial = "+ factorial(5));
    }
}