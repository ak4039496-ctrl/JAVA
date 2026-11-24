/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Series Generation Using Method Overloading
*/

public class series {

    // Natural number series
    static void series(int n) {

        System.out.print("Natural Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " ");
        }

        System.out.println();
    }

    // Even number series
    static void series(int start,int end) {

        System.out.print("Even Series: ");

        for (int i = start; i <= end; i++) {

            if (i % 2 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // Character series
    static void series(char start,char end) {

        System.out.print("Character Series: ");

        for (char ch = start; ch <= end;ch++) {

            System.out.print(ch + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Natural series
        series(10);

        // Even series
        series(1, 20);

        // Character series
        series('A', 'H');
    }
}
