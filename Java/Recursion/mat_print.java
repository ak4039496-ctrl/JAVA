/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Matrix Using Recursion
*/

public class mat_print {

    static void print(int[][] mat,int row,int col) {

        if(row ==mat.length) {
            return;
        }

        if(col ==mat[0].length) {

            System.out.println();

            print(mat, row + 1,0);
            return;
        }

        System.out.print( mat[row][col]+ " ");

        print(mat,row,col + 1);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };

        print(mat,0,0);
    }
}