// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of cubes of first n numbers 

public class print_sum_of_series_cube {
    public static void main(String[] args) {
        int n = 10; // limit
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum += (i * i * i); // add cube
            i++;
        }

        System.out.println("Sum of cubes of first " + n + " numbers => " + sum);
    }
}
