// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Neon (sum of digits of square equals number)

public class neon_number_check {
    public static void main(String[] args) {
        int num = 9; // Step 1: Input number
        int square = num * num; // Step 2: Square
        int sum = 0; // Step 3: Initialize sum
        do {
            int digit = square % 10; // Step 4: Extract digit
            sum += digit; // Step 5: Add digit
            square /= 10; // Step 6: Remove last digit
        } while (square > 0); // Step 7: Condition check
        if (sum == num) {
            System.out.println(num + " is Neon");
        } else {
            System.out.println(num + " is Not Neon");
        }
    }
}
