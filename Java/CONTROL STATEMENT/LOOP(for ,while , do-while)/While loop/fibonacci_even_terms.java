// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print even terms of Fibonacci series using while loop

public class fibonacci_even_terms {
    public static void main(String[] args) {
        int a = 0; // first term
        int b = 1; // second term
        int count = 2; // already two terms
        int n = 10; // total terms

        System.out.println("Even terms in Fibonacci series:");

        while (count <= n) {
            int c = a + b; // next term
            if (c % 2 == 0) {
                System.out.println(c); // print if even
            }
            a = b;
            b = c;
            count++;
        }
    }
}
