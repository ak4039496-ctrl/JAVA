/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Minimum Matrix Element
*/

public class mat_min {

    static int min(int[][] mat,int row,int col,int currentMin) {

        if(row == mat.length) {
            return currentMin;
        }

        if(col == mat[0].length) {

            return min(mat,row + 1,0,currentMin);
        }

        currentMin =Math.min(currentMin,mat[row][col]);

        return min(mat,row,col + 1,currentMin);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {10,50,30},
                {5,20,40}
        };

        System.out.println(min(mat,0,0,mat[0][0]));
    }
}