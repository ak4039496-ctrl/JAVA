/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Division Using Method
*/

public class div {

    // Method to divide numbers
    static double divide(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        double result = divide(20, 4);

        System.out.println("Division => " + result);
    }
}