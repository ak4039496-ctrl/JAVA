// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of arithmetic series a + (a+d) + ... up to n terms

public class sum_of_series_arithmetic {
    public static void main(String[] args) {
        int a = 5, d = 3, n = 10, i = 0, sum = 0;
        do {
            sum += a + i * d;
            i++;
        } while (i < n);
        System.out.println("Sum of arithmetic series => " + sum);
    }
}
