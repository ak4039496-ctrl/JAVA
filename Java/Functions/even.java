/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Even Number Using Method
*/

public class even {

    // Method to check even number
    static boolean isEven(int num) {

        // Check divisibility by 2
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        // Number to check
        int num = 24;

        // Method call
        if (isEven(num))
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Not Even");
    }
}