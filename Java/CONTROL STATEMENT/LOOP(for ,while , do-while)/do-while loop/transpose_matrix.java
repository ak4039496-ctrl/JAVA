// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print transpose of matrix

public class transpose_matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matrix[j][i] + " ");
                j++;
            } while (j < matrix.length);
            System.out.println();
            i++;
        } while (i < matrix[0].length);
    }
}
