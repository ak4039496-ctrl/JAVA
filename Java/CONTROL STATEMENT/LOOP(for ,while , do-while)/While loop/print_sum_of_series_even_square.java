// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of squares of even numbers up to 20 

public class print_sum_of_series_even_square {
    public static void main(String[] args) {
        int i = 2; // start with first even
        int sum = 0;

        while (i <= 20) {
            sum += (i * i); // add square
            i += 2; // move to next even
        }

        System.out.println("Sum of squares of even numbers => " + sum);
    }
}
