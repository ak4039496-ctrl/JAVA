/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Armstrong Number Using Recursion
*/

public class armstrong {

    // Recursive method
    static int armstrongSum(int num) {

        // Base case
        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        return (digit * digit * digit) + armstrongSum(num / 10);
    }

    public static void main(String[] args) {

        int num = 153;

        if (num == armstrongSum(num)) {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}