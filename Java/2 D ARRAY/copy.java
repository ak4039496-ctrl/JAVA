/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: copy.java
Purpose: Copy one matrix into another
*/

public class copy {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = new int[a.length][a[0].length];

        // Copy elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i][j] = a[i][j];
            }
        }

        // Print copied matrix
        System.out.println("Copied Matrix:");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
