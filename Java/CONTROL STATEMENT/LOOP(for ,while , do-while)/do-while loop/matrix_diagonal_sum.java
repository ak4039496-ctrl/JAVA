// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of diagonal elements of matrix

public class matrix_diagonal_sum {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = 0, sum = 0;
        do {
            sum += matrix[i][i]; // Add main diagonal
            i++;
        } while (i < matrix.length);
        System.out.println("Diagonal Sum => " + sum);
    }
}
