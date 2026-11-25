/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Main Diagonal Using Recursion
*/

public class mat_diag {

    static void diagonal(int[][] mat,int index) {

        if(index == mat.length) {

            return;
        }

        System.out.print(mat[index][index]+ " ");
                diagonal(mat,index + 1);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        diagonal(mat,0);
    }
}