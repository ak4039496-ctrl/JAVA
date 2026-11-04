// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of factorials of even numbers up to N

public class sum_of_series_even_factorial {
    public static void main(String[] args) {
        int n = 6, i = 2, sum = 0;
        do {
            int fact = 1, j = 1;
            do {
                fact *= j;
                j++;
            } while (j <= i);
            sum += fact;
            i += 2;
        } while (i <= n);
        System.out.println("Sum of even factorials => " + sum);
    }
}
