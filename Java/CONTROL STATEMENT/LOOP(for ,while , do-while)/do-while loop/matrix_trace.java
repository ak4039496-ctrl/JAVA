// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find trace of matrix (sum of diagonal)

public class matrix_trace {
    public static void main(String[] args) {
        int matrix[][] = {{2,3,4},{5,6,7},{8,9,10}};
        int i = 0, sum = 0;
        do {
            sum += matrix[i][i];
            i++;
        } while (i < matrix.length);
        System.out.println("Trace => " + sum);
    }
}
