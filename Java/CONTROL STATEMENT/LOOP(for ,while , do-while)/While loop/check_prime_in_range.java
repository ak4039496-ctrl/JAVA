// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check and print prime numbers between 1 and 50 using while loop

public class check_prime_in_range {
    public static void main(String[] args) {
        int num = 1; // start number

        while (num <= 50) { // loop until 50
            int i = 2; // divisor starts from 2
            boolean isPrime = true; // assume prime

            while (i <= num / 2) { // check divisibility
                if (num % i == 0) {
                    isPrime = false; // not prime
                    break;
                }
                i++;
            }

            if (isPrime && num > 1) {
                System.out.println(num); // print prime number
            }
            num++;
        }
    }
}
