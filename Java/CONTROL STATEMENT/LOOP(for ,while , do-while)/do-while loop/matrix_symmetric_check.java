// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if matrix is symmetric

public class matrix_symmetric_check {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{2,4,5},{3,5,6}};
        boolean symmetric = true;
        int i = 0;
        do {
            int j = 0;
            do {
                if (matrix[i][j] != matrix[j][i]) {
                    symmetric = false;
                    break;
                }
                j++;
            } while (j < matrix.length);
            i++;
        } while (i < matrix.length);
        if (symmetric) System.out.println("Symmetric Matrix");
        else System.out.println("Not Symmetric Matrix");
    }
}
