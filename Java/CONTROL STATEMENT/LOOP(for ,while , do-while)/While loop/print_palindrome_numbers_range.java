// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print palindrome numbers between 100 and 200 using while loop

public class print_palindrome_numbers_range {
    public static void main(String[] args) {
        int num = 100;

        while (num <= 200) {
            int temp = num;
            int rev = 0;

            while (temp > 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            }

            if (num == rev) {
                System.out.println(num);
            }
            num++;
        }
    }
}
