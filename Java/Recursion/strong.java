/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Strong Number Using Recursion
*/

public class strong {

    // Recursive factorial
    static int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n *factorial(n - 1);
    }

    // Recursive digit factorial sum
    static int strongSum(int num) {

        if (num == 0) {
            return 0;
        }

        return factorial(num % 10)+strongSum(num / 10);
    }

    public static void main(String[] args) {

        int num = 145;

        if (num ==strongSum(num)) {

            System.out.println("Strong Number");
        }
        else {
            System.out.println("Not Strong Number");
        }
    }
}