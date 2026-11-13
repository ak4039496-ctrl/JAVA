/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Average Using Method
*/

public class average {

    // Method to calculate average
    static double findAverage(int a, int b, int c) {

        // Calculate total sum
        int sum = a + b + c;

        // Return average
        return sum / 3.0;
    }

    public static void main(String[] args) {

        // Store average result
        double avg = findAverage(10, 20, 30);

        // Display result
        System.out.println("Average => " + avg);
    }
}