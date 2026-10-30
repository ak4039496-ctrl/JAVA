// Author: Amit Gupta
// Date: 06-09-2026
// Program: Subtract two matrices

public class matrix_subtraction {
    public static void main(String[] args) {
        int a[][] = {{5,4,3},{2,1,0},{9,8,7}};
        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int diff[][] = new int[3][3];

        int i = 0;
        do {
            int j = 0;
            do {
                diff[i][j] = a[i][j] - b[i][j];
                j++;
            } while (j < 3);
            i++;
        } while (i < 3);

        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(diff[i][j] + " ");
                j++;
            } while (j < 3);
            System.out.println();
            i++;
        } while (i < 3);
    }
}
