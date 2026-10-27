// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of squares of first n numbers using while loop

public class print_sum_of_first_n_squares {
    public static void main(String[] args) {
        int n = 8; // limit
        int i = 1; // start with 1
        int sum = 0; // store sum

        while (i <= n) {
            sum += (i * i); // add square
            i++; // move to next number
        }

        System.out.println("Sum of squares of first " + n + " numbers => " + sum);
    }
}
