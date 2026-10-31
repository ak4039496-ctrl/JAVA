// Author: Amit Gupta
// Date: 06-07-2026
// Program: Print prime numbers from 1 to 50

public class prime_series_1_to_50 {
    public static void main(String[] args) {
        int num = 2; //  Start from 2
        do {
            boolean prime = true; // Assume prime
            int i = 2; // Divisor
            do {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            } while (i <= num / 2);
            if (prime) {
                System.out.print(num + " ");
            }
            num++;
        } while (num <= 50);
    }
}
