// Author: Amit Gupta
// Date: 06-09-2026
// Program: Find sum of factorials of digits of a number

public class sum_of_factorials_digits {
    public static void main(String[] args) {
        int num = 145;
        int temp = num, sum = 0;
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
        System.out.println("Sum of factorials of digits => " + sum);
    }
}
