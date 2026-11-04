// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of squares of even numbers up to N

public class sum_of_series_square_even {
    public static void main(String[] args) {
        int n = 10, i = 2, sum = 0;
        do {
            sum += i * i;
            i += 2;
        } while (i <= n * 2);
        System.out.println("Sum => " + sum);
    }
}
