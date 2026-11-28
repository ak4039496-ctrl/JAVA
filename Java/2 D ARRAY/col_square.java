/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print square numbers in each column
*/

public class col_square {
    static boolean isSquare(int n) {
        int root = (int)Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {4, 7, 9},
            {16, 20, 25},
            {30, 36, 49}
        };

        int rows = arr.length, cols = arr[0].length;
        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " squares = ");
            for (int i = 0; i < rows; i++) {
                if (isSquare(arr[i][j])) 
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
