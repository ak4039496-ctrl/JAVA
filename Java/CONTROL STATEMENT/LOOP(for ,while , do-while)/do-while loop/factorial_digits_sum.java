// Author: Amit Gupta
// Date: 06-09-2026
// Program: Sum of factorials of digits (example: 145)

public class factorial_digits_sum {
    public static void main(String[] args) {
        int num = 145, temp = num, sum = 0;
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
        System.out.println("Sum of factorial digits => " + sum);
    }
}
