/*
Author: Amit Gupta
Date: 05-09-2026
Program: Print first 10 terms of Fibonacci series
*/

public class Fibonacci_series_10_terms {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
