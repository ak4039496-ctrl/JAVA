// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of cubes of odd numbers up to 15

public class print_sum_of_series_odd_cube {
    public static void main(String[] args) {
        int i = 1; // start with first odd
        int sum = 0;

        while (i <= 15) {
            sum += (i * i * i); // add cube
            i += 2; // move to next odd
        }

        System.out.println("Sum of cubes of odd numbers => " + sum);
    }
}
