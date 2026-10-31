// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of prime digits in a number

public class prime_sum_digits {
    public static void main(String[] args) {
        int num = 23759, sum = 0;
        do {
            int digit = num % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum += digit;
            }
            num /= 10;
        } while (num > 0);
        System.out.println("Sum of prime digits => " + sum);
    }
}
