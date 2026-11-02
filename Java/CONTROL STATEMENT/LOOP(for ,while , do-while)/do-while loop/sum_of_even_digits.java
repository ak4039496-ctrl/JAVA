// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find sum of even digits in a number

public class sum_of_even_digits {
    public static void main(String[] args) {
        int num = 123456; // Input number
        int sum = 0; // Initialize sum
        do {
            int digit = num % 10; //Extract digit
            if (digit % 2 == 0) { // Check even
                sum += digit; //  Add to sum
            }
            num /= 10; //  Remove last digit
        } while (num > 0); //  Condition check
        System.out.println("Sum of even digits => " + sum); // Print result
    }
}
