/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Spy Number Using Method
*/

public class spy {

    // Method to check spy number
    static boolean isSpy(int num) {

        int sum = 0;
        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            sum += digit;

            product *= digit;

            num /= 10;
        }

        return sum == product;
    }

    public static void main(String[] args) {

        int num = 123;

        if (isSpy(num))
            System.out.println(num + " is Spy Number");
        else
            System.out.println(num + " is Not Spy Number");
    }
}