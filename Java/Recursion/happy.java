/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Happy Number Using Recursion
*/

public class happy {

    static int squareSum(int num) {

        if (num == 0) {
            return 0;
        }

        int digit = num % 10;

        return (digit * digit)+ squareSum(num / 10);
    }

    static boolean isHappy(int num) {

        if (num == 1) {
            return true;
        }

        if (num == 4) {
            return false;
        }

        return isHappy(squareSum(num));
    }

    public static void main(String[] args) {

        int num = 19;

        if (isHappy(num)) {

            System.out.println("Happy Number");
        }
        else {

            System.out.println("Not Happy Number");
        }
    }
}