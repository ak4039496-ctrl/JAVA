// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of prime numbers up to 100

public class sum_of_prime_numbers {
    public static void main(String[] args) {
        int num = 2, sum = 0;
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
            if (prime) sum += num;
            num++;
        } while (num <= 100);
        System.out.println("Sum => " + sum);
    }
}
