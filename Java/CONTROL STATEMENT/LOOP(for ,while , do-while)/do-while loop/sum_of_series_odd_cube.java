// Author: Amit Gupta
// Date: 06-09-2026
// Program: Calculate sum of cubes of odd numbers up to n

public class sum_of_series_odd_cube {
    public static void main(String[] args) {
        int n = 19, i = 1, sum = 0;
        do {
            sum += i * i * i;
            i += 2;
        } while (i <= n);
        System.out.println("Sum => " + sum);
    }
}
