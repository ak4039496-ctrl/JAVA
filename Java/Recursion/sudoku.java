/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Sudoku Cell Traversal
*/

public class sudoku {

    static void solve(int row, int col) {

        if (row == 9) {

            System.out.println("Solved");

            return;
        }

        if (col == 9) {

            solve(row + 1, 0);

            return;
        }

        solve(row,col + 1);
    }

    public static void main(String[] args) {

        solve(0, 0);
    }
}