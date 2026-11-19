/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Table Using Method
*/

public class table {

    // Method to print table
    static void printTable(int num) {

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Print multiplication result
            System.out.println(num + " x " + i +" = " + (num * i));
        }
    }

    public static void main(String[] args) {

        // Print table of 7
        printTable(7);
    }
}