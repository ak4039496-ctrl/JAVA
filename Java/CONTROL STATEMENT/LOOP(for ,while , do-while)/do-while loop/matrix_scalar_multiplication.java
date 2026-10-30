// Author: Amit Gupta
// Date: 06-09-2026
// Program: Multiply matrix by scalar

public class matrix_scalar_multiplication {
    public static void main(String[] args) {
        int matrix[][] = {{1,2},{3,4}};
        int scalar = 5;
        int i = 0;
        do {
            int j = 0;
            do {
                matrix[i][j] *= scalar;
                j++;
            } while (j < matrix[0].length);
            i++;
        } while (i < matrix.length);

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(matrix[i][j] + " ");
                j++;
            } while (j < matrix[0].length);
            System.out.println();
            i++;
        } while (i < matrix.length);
    }
}
