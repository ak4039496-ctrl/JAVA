/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Odd Number Using Method
*/

public class odd {

    // Method to check odd number
    static boolean isOdd(int num) {

        // Check not divisible by 2
        return num % 2 != 0;
    }

    public static void main(String[] args) {

        // Number to check
        int num = 15;

        // Method call
        if (isOdd(num))
            System.out.println(num + " is Odd");
        else
            System.out.println(num + " is Not Odd");
    }
}