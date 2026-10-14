/*
Author: Amit Gupta
Date: 05-09-2026
Program: Check if a number is prime
*/

public class Check_prime_number {
    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = true;

        for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
