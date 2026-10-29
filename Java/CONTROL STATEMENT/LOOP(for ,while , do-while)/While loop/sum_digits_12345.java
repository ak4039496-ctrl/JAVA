// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of digits of number 12345 using while loop

public class sum_digits_12345 {
    public static void main(String[] args) {
        int num = 12345; // number to process
        int sum = 0; // variable to store sum

        while (num > 0) {
            int digit = num % 10; // extract last digit
            sum += digit; // add digit to sum
            num /= 10; // remove last digit
        }

        System.out.println("Sum of digits => " + sum);
    }
}
