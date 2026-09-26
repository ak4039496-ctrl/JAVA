// Author: Amit Gupta
// Date: 09-09-2026
// Program: Stop loop when prime number is found

public class break_on_prime {
    public static void main(String[] args) {
        
        int[] numbers = {4, 6, 8, 11, 15};
        
        for (int i = 0; i < numbers.length; i++) {
            boolean prime = true;
            
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    prime = false;
                    break;
                }
            }
            
            if (prime) {
                System.out.println("Prime found: " + numbers[i]);
                break; // stop loop
            }
        }
    }
}
