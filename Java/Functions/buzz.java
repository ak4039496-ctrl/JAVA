/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Buzz Number Using Method
*/

public class buzz {

    // Method to check buzz number
    static boolean isBuzz(int num) {

        return (num % 7 == 0 || num % 10 == 7);
    }

    public static void main(String[] args) {

        int num = 77;

        if (isBuzz(num))
            System.out.println(num + " is Buzz Number");
        else
            System.out.println(num + " is Not Buzz Number");
    }
}