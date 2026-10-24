// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print first 10 terms of Fibonacci series using while loop

public class fibonacci_10_terms {
    public static void main(String[] args) {
        int a = 0; // first term
        int b = 1; // second term
        int count = 2; // already printed 2 terms

        System.out.println(a); // print first term
        System.out.println(b); // print second term

        while (count <= 10) {
            int c = a + b; // next term
            System.out.println(c); // print term
            a = b; // shift values
            b = c;
            count++; // increase count
        }
    }
}
