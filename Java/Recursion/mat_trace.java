/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Matrix Trace Using Recursion
*/

public class mat_trace {

    static int trace(int[][] mat,int index) {

        if(index ==mat.length) {
            return 0;
        }

        return mat[index][index]+trace(mat,index + 1);
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(trace(mat,0));
    }
}