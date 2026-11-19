/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Armstrong Number Using Method Overloading
*/

public class armstrong {

    // Check single number
    static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {

            int digit = num % 10;

            sum += digit * digit * digit;

            num /= 10;
        }

        return original == sum;
    }

    // Print armstrong in range
    static void isArmstrong(int start,int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println(isArmstrong(153));
        isArmstrong(1, 500);
    }
}