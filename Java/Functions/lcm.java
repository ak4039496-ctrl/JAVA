/*
Author: Amit Gupta
Date: 09-Oct-2026
Purpose: Find LCM Using Method
*/

public class lcm {

    // Method to find GCD
    static int findGcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    // Method to find LCM
    static int findLcm(int a, int b) {

        return (a * b) / findGcd(a, b);
    }

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 18;

        int result = findLcm(num1, num2);

        System.out.println("LCM = " + result);
    }
}