/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Spy Number Using Recursion
*/

public class spy {

    static int digitSum(int num) {

        if (num == 0) {
            return 0;
        }

        return (num % 10)+ digitSum(num / 10);
    }

    static int digitProduct(int num) {

        if (num == 0) {
            return 1;
        }

        return (num % 10)* digitProduct(num / 10);
    }

    public static void main(String[] args) {

        int num = 123;

        if (digitSum(num)== digitProduct(num)) {

            System.out.println("Spy Number");
        }
        else {
            System.out.println("Not Spy Number");
        }
    }
}