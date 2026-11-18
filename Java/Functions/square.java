/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Square Using Method
*/

public class square {

    // Method to calculate square
    static int findSquare(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        int result = findSquare(8);

        System.out.println("Square = " + result);
    }
}