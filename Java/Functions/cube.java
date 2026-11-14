/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Cube Using Method
*/

public class cube {

    // Method to calculate cube
    static int findCube(int num) {
        return num * num * num;
    }

    public static void main(String[] args) {

        int result = findCube(4);

        System.out.println("Cube => " + result);
    }
}