/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Table Using Recursion
*/

public class table {

    // Recursive method
    static void printTable(int num, int i) {

        // Base case
        if (i > 10) {
            return;
        }

        // Print current multiplication
        System.out.println(num + " x " + i +" = " + (num * i));

        // Recursive call
        printTable(num, i + 1);
    }

    public static void main(String[] args) {

        printTable(5, 1);
    }
}