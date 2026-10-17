/*
Author: Amit Gupta
Date: 05-09-2026
Program: Reverse a number
*/

public class Reverse_number {
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;

        for(; num > 0; num /= 10) {
            rev = rev * 10 + (num % 10);
        }

        System.out.println("Reversed number => " + rev);
    }
}
