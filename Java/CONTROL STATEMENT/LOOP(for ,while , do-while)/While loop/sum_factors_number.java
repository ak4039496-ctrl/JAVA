// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of factors of number 36 

public class sum_factors_number {
    public static void main(String[] args) {
        int num = 36; // number to process
        int i = 1;
        int sum = 0;

        while (i <= num) {
            if (num % i == 0) {
                sum += i; // add factor
            }
            i++;
        }

        System.out.println("Sum of factors => " + sum);
    }
}
