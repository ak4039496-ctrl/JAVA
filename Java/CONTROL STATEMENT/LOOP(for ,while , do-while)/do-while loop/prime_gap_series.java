// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print prime gaps between consecutive primes up to 50

public class prime_gap_series {
    public static void main(String[] args) {
        int prev = 2, num = 3;
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
            if (prime) {
                System.out.println("Gap between " + prev + " and " + num + " => " + (num - prev));
                prev = num;
            }
            num++;
        } while (num <= 50);
    }
}
