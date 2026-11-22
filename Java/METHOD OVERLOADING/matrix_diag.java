/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Diagonal Elements Using Overloading
 */

public class matrix_diag {

    static void diagonal(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i][i] + " ");
        }

        System.out.println();
    }

    static void diagonal(char[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        diagonal(new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        });

        diagonal(new char[][]{
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'}
        });
    }
}
