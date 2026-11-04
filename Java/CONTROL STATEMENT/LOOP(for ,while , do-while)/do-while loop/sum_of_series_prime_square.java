// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of squares of prime numbers up to N

public class sum_of_series_prime_square {
    public static void main(String[] args) {
        int n = 50, num = 2, sum = 0;
        do {
            boolean prime = true;
            int i = 2;
            do {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            } while (i <= num / 2);
            if (prime) sum += num * num;
            num++;
        } while (num <= n);
        System.out.println("Sum of prime squares => " + sum);
    }
}
