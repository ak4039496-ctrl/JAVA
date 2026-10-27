// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of natural numbers up to n using while loop

public class print_sum_of_natural_numbers {
    public static void main(String[] args) {
        int n = 15; // limit
        int i = 1; // start with 1
        int sum = 0; // store sum

        // loop until i <= n
        while (i <= n) {
            sum += i; // add current number
            i++; // move to next number
        }

        System.out.println("Sum of natural numbers up to " + n + " => " + sum);
    }
}
