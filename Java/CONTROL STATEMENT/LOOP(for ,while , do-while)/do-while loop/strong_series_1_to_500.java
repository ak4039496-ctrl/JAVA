// Author: Amit Gupta
// Date: 06-09-2026
// Program: Print all Strong numbers between 1 and 500

public class strong_series_1_to_500 {
    public static void main(String[] args) {
        int num = 1;
        do {
            int temp = num;
            int sum = 0;
            do {
                int digit = temp % 10;
                int fact = 1, i = 1;
                do {
                    fact *= i;
                    i++;
                } while (i <= digit);
                sum += fact;
                temp /= 10;
            } while (temp > 0);
            if (sum == num) {
                System.out.println(num);
            }
            num++;
        } while (num <= 500);
    }
}
