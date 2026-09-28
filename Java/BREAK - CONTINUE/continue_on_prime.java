// Author: Amit Gupta
// Date: 29-09-2026
// Program: Skip prime numbers

public class continue_on_prime {
    public static void main(String[] args) {
        
        int[] numbers = {2, 3, 4, 5, 6, 7};
        
        for (int i = 0; i < numbers.length; i++) {
            boolean prime = true;
            
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            
            if (prime) {
                continue; // skip prime
            }
            
            System.out.println(numbers[i]);
        }
    }
}
