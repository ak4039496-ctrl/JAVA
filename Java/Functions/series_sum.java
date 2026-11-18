/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Sum of Series Using Method
Series: 1 + 2 + 3 + ... + N
*/

public class series_sum {

    // Method to calculate series sum
    static int findSeriesSum(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        int n = 100;

        int result = findSeriesSum(n);

        System.out.println("Series Sum = " + result);
    }
}