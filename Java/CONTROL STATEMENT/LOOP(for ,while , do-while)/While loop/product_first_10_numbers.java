// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find product of first 10 natural numbers using while loop

public class product_first_10_numbers {
    public static void main(String[] args) {
        int i = 1; // start with 1
        int product = 1; // variable to store product

        while (i <= 10) {
            product *= i; // multiply product by current number
            i++; // move to next number
        }

        System.out.println("Product of first 10 numbers => " + product);
    }
}
