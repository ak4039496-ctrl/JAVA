// Author: Amit Gupta
// Date: 06-09-2026
// Program: Count even digits in a number

public class count_even_digits {
    public static void main(String[] args) {
        int num = 123456; // Input number
        int count = 0; //  Initialize counter
        do {
            int digit = num % 10; //  Extract digit
            if (digit % 2 == 0) { // Check even
                count++; // Increment counter
            }
            num /= 10; //  Remove last digit
        } while (num > 0); //  Condition check
        System.out.println("Even digits count => " + count); // Step 8: Print result
    }
}
