// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print palindrome numbers up to N

public class palindrome_series_n {
    public static void main(String[] args) {
        int n = 200, num = 1;
        do {
            int temp = num, rev = 0;
            do {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp /= 10;
            } while (temp > 0);
            if (rev == num) System.out.println(num);
            num++;
        } while (num <= n);
    }
}
