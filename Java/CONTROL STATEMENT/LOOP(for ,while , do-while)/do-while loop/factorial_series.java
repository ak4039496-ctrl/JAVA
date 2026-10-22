// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print factorials of numbers 1 to 10

public class factorial_series {
    public static void main(String[] args) {
        int n = 1; //  Start number
        do {
            int fact = 1, i = 1; //  Initialize factorial
            do {
                fact *= i; //  Multiply
                i++; // Increment
            } while (i <= n); // Condition check
            System.out.println("Factorial of " + n + " => " + fact);
            n++; //  Next number
        } while (n <= 10); //  Condition check
    }
}
