/*
Author: Amit Gupta
Date: 09-Oct-2026
Program: col_prime.java
Purpose: Print prime numbers in each column
*/

public class col_prime {
    static boolean isPrime(int n) {
        // Base Case
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) 
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {2, 4, 5},
            {6, 7, 8},
            {9, 10, 11}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            System.out.print("Column " + (j+1) + " primes = ");
            for (int i = 0; i < rows; i++) {
                if (isPrime(arr[i][j])) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
