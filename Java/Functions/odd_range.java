/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Odd Numbers in Range
*/

public class odd_range {

    // Method to check odd
    static boolean isOdd(int num) {

        return num % 2 != 0;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (isOdd(i))
                System.out.print(i + " ");
        }
    }
}