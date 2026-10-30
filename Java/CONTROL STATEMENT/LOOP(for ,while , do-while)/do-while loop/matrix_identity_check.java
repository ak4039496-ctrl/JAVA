// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if matrix is identity

public class matrix_identity_check {
    public static void main(String[] args) {
        int matrix[][] = {{1,0,0},{0,1,0},{0,0,1}};
        boolean identity = true;
        int i = 0;
        do {
            int j = 0;
            do {
                if (i == j && matrix[i][j] != 1) identity = false;
                if (i != j && matrix[i][j] != 0) identity = false;
                j++;
            } while (j < matrix.length);
            i++;
        } while (i < matrix.length);
        if (identity) System.out.println("Identity Matrix");
        else System.out.println("Not Identity Matrix");
    }
}
