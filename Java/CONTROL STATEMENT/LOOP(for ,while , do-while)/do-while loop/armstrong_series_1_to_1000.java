// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print all Armstrong numbers between 1 and 1000
public class armstrong_series_1_to_1000 {
    public static void main(String[] args) {
        int num = 1;
        do {
            int temp = num, sum = 0;
            do {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            } while (temp > 0);
            if (sum == num) {
                System.out.println(num);
            }
            num++;
        } while (num <= 1000);
    }
}
