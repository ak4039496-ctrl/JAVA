// Author: Amit Gupta
// Date: 26-09-2026
// Program: Sum of series 1/1! + 1/2! + ... + 1/n!

public class sum_of_series_factorial_reciprocal {
    public static void main(String[] args) {
        int n = 5, i = 1;
        double sum = 0;
        do {
            int fact = 1, j = 1;
            do {
                fact *= j;
                j++;
            } while (j <= i);
            sum += 1.0 / fact;
            i++;
        } while (i <= n);
        System.out.println("Sum => " + sum);
    }
}
