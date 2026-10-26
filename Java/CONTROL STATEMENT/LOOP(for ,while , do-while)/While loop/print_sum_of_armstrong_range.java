// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of Armstrong numbers between 1 and 1000 using while loop

public class print_sum_of_armstrong_range {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 1000) {
            int temp = num;
            int total = 0;

            while (temp > 0) {
                int digit = temp % 10;
                total += digit * digit * digit;
                temp /= 10;
            }

            if (total == num) {
                sum += num; // add Armstrong number
            }
            num++;
        }

        System.out.println("Sum of Armstrong numbers => " + sum);
    }
}
