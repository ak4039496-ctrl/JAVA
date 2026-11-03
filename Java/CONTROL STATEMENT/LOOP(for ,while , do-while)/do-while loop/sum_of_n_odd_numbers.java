// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of first N odd numbers (example: N=10)

public class sum_of_n_odd_numbers {
    public static void main(String[] args) {
        int n = 10, i = 1, sum = 0;
        do {
            sum += (2 * i - 1);
            i++;
        } while (i <= n);
        System.out.println("Sum => " + sum);
    }
}
