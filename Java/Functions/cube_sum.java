/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum of Cubes Using Method
*/

public class cube_sum {

    // Method to calculate cube
    static int cube(int num) {

        return num * num * num;
    }

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {

            sum += cube(i);
        }

        System.out.println("Cube Sum => " + sum);
    }
}