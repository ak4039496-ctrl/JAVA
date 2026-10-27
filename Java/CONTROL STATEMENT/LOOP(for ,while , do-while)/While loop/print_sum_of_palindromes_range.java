// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of palindrome numbers between 1 and 200 using while loop

public class print_sum_of_palindromes_range {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 200) {
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            if (num == rev) {
                sum += num; // add palindrome
            }
            num++;
        }

        System.out.println("Sum of palindrome numbers => " + sum);
    }
}
