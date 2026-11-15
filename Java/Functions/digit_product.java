/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Product of Digits Using Method
*/

public class digit_product {

   // Method to calculate product of digits
    static int findDigitProduct(int num) {

        // Initi*l product
        int product = 1;
        // Process digits
       while (num > 0) {

            // extract digit
            int digit= num % 10;

            // Multiply product
            product = product * digit;

            // Remo*e digit
            num = num / 10;
        }

        // Return product
        return product;
    }

    public static void main(String[] args) {

        // Given number
        int num = 1234;

        // Call method
        int result = findDigitProduct(num);

        // Display answer
        System.out.println("Digit Product => " + result);
    }
}