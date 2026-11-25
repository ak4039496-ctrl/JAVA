/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Sum Using Recursion
*/

public class mat_sum {

    static int sum(int[][] mat,int row,int col) {

        if (row == mat.length) {
            return 0;
        }

        if (col == mat[0].length) {

            return sum(mat,row + 1,0);
        }

        return mat[row][col]+ sum(mat,row,col + 1);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println("Sum = "+ sum(mat,0,0));
    }
}