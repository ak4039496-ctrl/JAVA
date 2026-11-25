/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Row Sum Using Recursion
*/

public class mat_row_sum {

    static int rowSum(int[][] mat,int row,int col) {

        if(col ==mat[0].length) {

            return 0;
        }

        return mat[row][col]+rowSum(mat,row,col + 1);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,5,3},
                {4,5,6}
        };

        System.out.println(rowSum(mat,0,0));
    }
}