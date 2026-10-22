// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print Fibonacci series up to 10 terms

public class fibonacci_series {
    public static void main(String[] args) {
        int a = 0, b = 1; // Step 1: Initialize first two terms
        int count = 1; // Step 2: Counter
        do {
            System.out.println(a); // Step 3: Print current term
            int next = a + b; // Step 4: Calculate next term
            a = b; // Step 5: Shift values
            b = next; // Step 6: Update next term
            count++; // Step 7: Increment counter
        } while (count <= 10); // Step 8: Condition check
    }
}
