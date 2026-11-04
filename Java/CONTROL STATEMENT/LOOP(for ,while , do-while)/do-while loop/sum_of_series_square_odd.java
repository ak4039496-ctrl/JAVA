// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of squares of odd numbers up to N

public class sum_of_series_square_odd {
    public static void main(String[] args) {
        int n = 10, i = 1, sum = 0;
        do {
            sum += i * i;
            i += 2;
        } while (i <= n * 2 - 1);
        System.out.println("Sum => " + sum);
    }
}
