// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of numbers from 1 to 20 skipping multiples of 5 
public class sum_numbers_skip_5 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 20) {
            if (i % 5 != 0) {
                sum += i;
            }
            i++;
        }

        System.out.println("Sum (excluding multiples of 5) => " + sum);
    }
}
