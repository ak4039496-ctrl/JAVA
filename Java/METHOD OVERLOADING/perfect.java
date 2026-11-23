/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Perfect Number Using Method Overloading
*/

public class perfect {

    static boolean perfect(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {

            if (num % i == 0) {

                sum += i;
            }
        }

        return sum == num;
    }

    static void perfect(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (perfect(i)) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println(perfect(28));

        perfect(1, 1000);
    }
}