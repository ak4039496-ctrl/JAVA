/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Strong Number Using Method Overloading
*/

public class strong {

    static int factorial(int num) {

        int fact = 1;

        for (int i = 1; i <= num; i++) {

            fact *= i;
        }

        return fact;
    }

    static boolean strong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += factorial(digit);

            num /= 10;
        }

        return original == sum;
    }

    static void strong(int start,int end) {

        for (int i = start; i <= end; i++) {

            if (strong(i)) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println(strong(145));

        strong(1, 1000);
    }
}