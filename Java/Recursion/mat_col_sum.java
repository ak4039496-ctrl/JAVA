/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Column Sum Using Recursion
*/

public class mat_col_sum {

    static int colSum(int[][] mat,int row,int col) {

        if(row ==mat.length) {

            return 0;
        }

        return mat[row][col]+colSum(mat,row + 1,col);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(colSum(mat,0,1));
    }
}