/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Search Element In Matrix
*/

public class mat_search {

    static boolean search(int[][] mat,int row,int col,int key) {

        if(row == mat.length) {
            return false;
        }

        if(col == mat[0].length) {

            return search(mat,row + 1,0,key);
        }

        if(mat[row][col] == key) {
            return true;
        }

        return search(mat,row,col + 1,key);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(search(mat,0,0,5));
    }
}