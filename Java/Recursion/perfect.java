/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Check Perfect Number Using Recursion
*/

public class perfect {

    // Recursive method to find factor sum
    static int factorSum(int num, int i) {

        // Base case
        if (i == num) {
            return 0;
        }

        // If factor found
        if (num % i == 0) {

            return i +factorSum(num, i + 1);
        }

        // Recursive call
        return factorSum(num, i + 1);
    }

    public static void main(String[] args) {

        int num = 28;

        if (factorSum(num, 1) == num) {

            System.out.println("Perfect Number");
        }
        else {

            System.out.println("Not Perfect Number");
        }
    }
}