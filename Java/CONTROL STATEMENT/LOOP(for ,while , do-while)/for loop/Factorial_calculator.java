/*
Author: Amit Gupta
Date: 05-09-2026
Program: Factorial Calculator
*/

public class Factorial_calculator {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for(int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " => " + fact);
    }
}
