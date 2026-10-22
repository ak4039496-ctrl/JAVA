// Author: Amit Gupta
// Date: 28-09-2026
// Program: Print factorials of numbers 1 to N

public class factorial_series_n {
    public static void main(String[] args) {
        int n = 10, i = 1;
        do {
            int fact = 1, j = 1;
            do {
                fact *= j;
                j++;
            } while (j <= i);
            System.out.println("Factorial of " + i + " => " + fact);
            i++;
        } while (i <= n);
    }
}
