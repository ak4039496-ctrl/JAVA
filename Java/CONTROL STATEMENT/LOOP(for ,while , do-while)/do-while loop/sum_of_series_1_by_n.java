// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of series 1 + 1/2 + 1/3 + ... + 1/n

public class sum_of_series_1_by_n {
    public static void main(String[] args) {
        int n = 10, i = 1;
        double sum = 0;
        do {
            sum += 1.0 / i;
            i++;
        } while (i <= n);
        System.out.println("Sum => " + sum);
    }
}
