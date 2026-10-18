// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print Armstrong numbers up to N

public class armstrong_series_n {
    public static void main(String[] args) {
        int n = 500, num = 1;
        do {
            int temp = num, sum = 0;
            do {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            } while (temp > 0);
            if (sum == num) System.out.println(num);
            num++;
        } while (num <= n);
    }
}
