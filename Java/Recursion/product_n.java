/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Product Of First N Natural Numbers
*/

public class product_n {

    // Recursive method
    static long product(int n) {

        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return n *product(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Product = " +product(5));
    }
}
