/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find Maximum Matrix Element
*/

public class mat_max {

    static int max(int[][] mat,int row,int col,int currentMax) {

        if(row == mat.length) {
            return currentMax;
        }

        if(col == mat[0].length) {

            return max(mat,row + 1,0,currentMax);
        }

        currentMax =Math.max(currentMax,mat[row][col]);

        return max(mat,row,col + 1,currentMax);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {10,50,30},
                {70,20,40}
        };

        System.out.println(max(mat, 0,0,mat[0][0]));
    }
}