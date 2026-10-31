// Author: Amit Gupta
// Date: 06-09-2026
// Program: Count prime numbers in range 1–100

public class prime_count_in_range {
    public static void main(String[] args) {
        int num = 2, count = 0;
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
            if (prime) count++;
            num++;
        } while (num <= 100);
        System.out.println("Prime count => " + count);
    }
}
