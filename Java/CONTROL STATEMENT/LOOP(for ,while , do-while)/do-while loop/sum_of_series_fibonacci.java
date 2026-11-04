// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of first N Fibonacci numbers

public class sum_of_series_fibonacci {
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1, sum = 0, count = 1;
        do {
            sum += a;
            int next = a + b;
            a = b; b = next;
            count++;
        } while (count <= n);
        System.out.println("Sum of Fibonacci => " + sum);
    }
}
