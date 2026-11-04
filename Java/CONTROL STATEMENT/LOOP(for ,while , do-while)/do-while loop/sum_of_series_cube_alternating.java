// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of series 1³ - 2³ + 3³ - 4³ + ... ± n³

public class sum_of_series_cube_alternating {
    public static void main(String[] args) {
        int n = 10, i = 1, sum = 0;
        do {
            if (i % 2 == 0) sum -= i * i * i;
            else sum += i * i * i;
            i++;
        } while (i <= n);
        System.out.println("Sum => " + sum);
    }
}
