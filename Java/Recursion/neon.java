/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Neon Number Using Recursion
*/

public class neon {

    // Recursive digit sum
    static int digitSum(int num) {

        if (num == 0) {
            return 0;
        }

        return (num % 10)+ digitSum(num / 10);
    }

    public static void main(String[] args) {

        int num = 9;

        int square = num * num;

        if (digitSum(square) == num) {

            System.out.println("Neon Number");
        }
        else {

            System.out.println("Not Neon Number");
        }
    }
}