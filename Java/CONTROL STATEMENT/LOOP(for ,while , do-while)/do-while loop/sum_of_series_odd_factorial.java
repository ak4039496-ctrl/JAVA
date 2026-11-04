// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of factorials of odd numbers up to N

public class sum_of_series_odd_factorial {
    public static void main(String[] args) {
        int n = 7, i = 1, sum = 0;
        do {
            int fact = 1, j = 1;
            do {
                fact *= j;
                j++;
            } while (j <= i);
            sum += fact;
            i += 2;
        } while (i <= n);
        System.out.println("Sum of odd factorials => " + sum);
    }
}
