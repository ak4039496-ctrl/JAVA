/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Largest Number Using Method
*/

public class max {

    // Method to find maximum value
    static int findMax(int a, int b) {

        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        int result = findMax(50, 90);

        System.out.println("Maximum => " + result);
    }
}