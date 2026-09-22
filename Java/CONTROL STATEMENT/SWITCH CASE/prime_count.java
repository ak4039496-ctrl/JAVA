// Author: Amit Gupta
// Date: 19-09-2026
// Program: Count prime numbers up to n

public class prime_count {
    public static void main(String[] args) {
        
        int n = 20; // range
        int choice = 1;
        
        switch(choice) {
            case 1:
                int count = 0;
                // Loop to check primes
                for(int num = 2; num <= n; num++) {
                    boolean prime = true;
                    for(int i = 2; i <= num/2; i++) {
                        if(num % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if(prime) {
                        count++;
                    }
                }
                System.out.println("Prime count up to " + n + " => " + count);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
