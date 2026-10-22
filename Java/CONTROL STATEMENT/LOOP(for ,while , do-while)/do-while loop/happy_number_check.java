// Author: Amit Gupta
// Date: 06-09-2026
// Program: Check if a number is Happy (sum of squares of digits eventually becomes 1)

public class happy_number_check {
    public static void main(String[] args) {
        int num = 19; //  Input number
        int sum;

        //  Repeat until single digit or 4 (loop detection)
        do {
            sum = 0; // Reset sum each cycle
            int temp = num; // Copy number

            // Calculate sum of squares of digits
            do {
                int digit = temp % 10; // Extract digit
                sum += digit * digit; // Add square of digit
                temp /= 10; // Remove last digit
            } while (temp > 0); // Continue until all digits processed

            num = sum; // Update num with new sum
        } while (num != 1 && num != 4); // Stop when num becomes 1 (happy) or 4 (not happy)

        //  Final check
        if (num == 1) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Not Happy Number");
        }
    }
}
