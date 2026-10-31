// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print matrix in reverse order

public class reverse_matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = matrix.length - 1;
        do {
            int j = matrix[i].length - 1;
            do {
                System.out.print(matrix[i][j] + " ");
                j--;
            } while (j >= 0);
            System.out.println();
            i--;
        } while (i >= 0);
    }
}
