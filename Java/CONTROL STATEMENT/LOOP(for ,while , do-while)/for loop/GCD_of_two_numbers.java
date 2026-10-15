/*
Author: Amit Gupta
Date: 05-09-2026
Program: Find GCD of two numbers
*/

public class GCD_of_two_numbers {
    public static void main(String[] args) {
        int a = 48, b = 18;
        int gcd = 1;

        for(int i = 1; i <= a && i <= b; i++) {
            if(a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD => " + gcd);
    }
}
