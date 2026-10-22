// Author: Amit Gupta
// Date: 16-10-2026
// Program: Print first N Fibonacci terms (example: 15)

public class fibonacci_n_terms {
    public static void main(String[] args) {
        int n = 15;
        int a = 0, b = 1, count = 1;
        do {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        } while (count <= n);
    }
}
