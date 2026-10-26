// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of cubes of first n numbers 

public class print_sum_of_first_n_cubes {
    public static void main(String[] args) {
        int n = 6; // limit
        int i = 1; // start with 1
        int sum = 0; // store sum

        while (i <= n) {
            sum += (i * i * i); // add cube
            i++; // move to next number
        }

        System.out.println("Sum of cubes of first " + n + " numbers = " + sum);
    }
}
