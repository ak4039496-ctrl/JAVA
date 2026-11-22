/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Addition Using Method Overloading
 */

public class matrix_add {

    static int add(int a, int b) {

        return a + b;
    }

    static int[][] add(int[][] a, int[][] b) {

        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2, 3}};
        int[][] b = {
            {1, 2, 3},
            {1, 2, 3}
        };

        System.out.println(add(10, 20));

        int[][] result = add(a, b);
        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

}
