/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Print Even Numbers in Range
*/

public class even_range {

    // Method to check even
    static boolean isEven(int num) {

        return num % 2 == 0;
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {

            if (isEven(i))
                System.out.print(i + " ");
        }
    }
}