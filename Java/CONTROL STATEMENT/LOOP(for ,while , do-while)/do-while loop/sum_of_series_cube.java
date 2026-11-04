// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of series 1³+2³+...+n³

public class sum_of_series_cube {
    public static void main(String[] args) {
        int n = 10, i = 1, sum = 0;
        do {
            sum += i * i * i;
            i++;
        } while (i <= n);
        System.out.println("Sum => " + sum);
    }
}
