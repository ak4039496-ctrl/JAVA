// Author: Amit Gupta
// Date: 17-09-2026
// Program: Print prime numbers from 1 to 50 

public class print_prime_1_to_50 {
    public static void main(String[] args) {
        int num = 2; // start with first prime

        while (num <= 50) {
            int i = 2;
            boolean isPrime = true;

            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println(num);
            }
            num++;
        }
    }
}
