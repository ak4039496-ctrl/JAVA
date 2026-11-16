/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Smallest Number Using Method
*/

public class min {

    // Method to find minimum value
    static int findMin(int a, int b) {

        if (a < b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {

        int result = findMin(50, 90);

        System.out.println("Minimum => " + result);
    }
}