// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print sum of first 10 Fibonacci numbers 

public class print_fibonacci_sum {
    public static void main(String[] args) {
        int a = 0; // first term
        int b = 1; // second term
        int sum = a + b; // sum of first two terms
        int count = 2; // already counted 2 terms

        // loop until 10 terms
        while (count < 10) {
            int c = a + b; // next term
            sum += c; // add to sum
            a = b; // shift
            b = c;
            count++; // increase count
        }

        System.out.println("Sum of first 10 Fibonacci numbers => " + sum);
    }
}
