/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sum Of Cubes Using Recursion
*/

public class cube_sum {

    // Recursive method
    static int sumCube(int n) {

        // Base case
        if (n == 1) {
            return 1;
        }

        // Recursive case
        return (n * n * n)+ sumCube(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("Cube Sum = "+ sumCube(5));
    }
}