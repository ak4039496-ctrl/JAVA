// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of matrix elements

public class sum_of_matrix {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int i = 0, sum = 0;
        do {
            int j = 0;
            do {
                sum += matrix[i][j];
                j++;
            } while (j < matrix[i].length);
            i++;
        } while (i < matrix.length);
        System.out.println("Sum => " + sum);
    }
}
