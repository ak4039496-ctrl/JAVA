// Author: Amit Gupta
// Date: 05-09-2026
// Program: Check if a number is prime using while loop

public class check_prime_number {
    public static void main(String[] args) {
        int num = 29; // number to check
        int i = 2; // start with 2
        boolean isPrime = true; // assume prime

        while (i <= num / 2) {
            if (num % i == 0) { // divisible
                isPrime = false;
                break; // exit loop
            }
            i++;
        }

        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
