/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Matrix Transpose
*/

public class mat_transpose {

    static void transpose(int[][] mat,int row,int col) {
        if(col ==mat[0].length) {
            return;
        }

        if(row ==mat.length) {
            System.out.println();

            transpose(mat,0,col + 1);
            return;
        }

        System.out.print(mat[row][col]+ " ");

        transpose(mat,row + 1,col);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };

        transpose(mat,0,0);
    }
}