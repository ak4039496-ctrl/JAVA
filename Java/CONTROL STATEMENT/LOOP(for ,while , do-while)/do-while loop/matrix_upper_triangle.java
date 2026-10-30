// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print upper triangle of matrix

public class matrix_upper_triangle {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = 0;
        do {
            int j = 0;
            do {
                if (i <= j) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("0 ");
                }
                j++;
            } while (j < matrix.length);
            System.out.println();
            i++;
        } while (i < matrix.length);
    }
}
