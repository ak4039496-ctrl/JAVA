// Author: Amit Gupta
// Date: 19-09-2026
// Program: Print prime factors of a number

public class prime_factors {
    public static void main(String[] args) {
        
        int num = 60; // number
        int choice = 1;
        
        switch(choice) {
            case 1:
                // Loop to find factors
                for(int i = 2; i <= num; i++) {
                    while(num % i == 0) {
                        System.out.print(i + " ");
                        num /= i;
                    }
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
