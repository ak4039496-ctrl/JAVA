/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Last Digit Using Method
*/

public class last_digit {

    // Method to return last digit
    static int getLastDigit(int num) {

        // Return remainder after dividing by 10
        return num % 10;
    }

    public static void main(String[] args) {

        // Given number
        int num = 987654;

        // Method call
        int result = getLastDigit(num);

        // Display output
        System.out.println("Number = " + num);
        System.out.println("Last Digit = " + result);
    }
}