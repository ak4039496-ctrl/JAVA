// Program: col_sum.java
// Purpose: Print sum of each column in a 2D array

public class col_sum {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            int colTotal = 0;
            for (int i = 0; i < rows; i++) {
                colTotal += arr[i][j];
            }
            System.out.println("Column " + (j+1) + " sum = " + colTotal);
        }
    }
}
