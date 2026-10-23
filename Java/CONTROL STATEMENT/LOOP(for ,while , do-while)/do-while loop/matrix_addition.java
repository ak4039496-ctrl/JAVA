// Author: Amit Gupta
// Date: 06-09-2026
// Program: Add two matrices

public class matrix_addition {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}}; //  First matrix
        int b[][] = {{9,8,7},{6,5,4},{3,2,1}}; //  Second matrix
        int sum[][] = new int[3][3]; //  Result matrix

        int i = 0; //  Row index
        do {
            int j = 0; //  Column index
            do {
                sum[i][j] = a[i][j] + b[i][j]; //  Add elements
                j++;
            } while (j < 3); //  Column loop
            i++;
        } while (i < 3); //  Row loop

        //  Print result
        i = 0;
        do {
            int j = 0;
            do {
                System.out.print(sum[i][j] + " ");
                j++;
            } while (j < 3);
            System.out.println();
            i++;
        } while (i < 3);
    }
}
