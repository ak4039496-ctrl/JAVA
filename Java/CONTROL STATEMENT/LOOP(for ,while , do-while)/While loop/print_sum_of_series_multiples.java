// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of multiples of 5 up to 50

public class print_sum_of_series_multiples {
    public static void main(String[] args) {
        int i = 5; // start with first multiple
        int sum = 0;

        while (i <= 50) {
            sum += i; // add multiple
            i += 5; // move to next multiple
        }

        System.out.println("Sum of multiples of 5 => " + sum);
    }
}
