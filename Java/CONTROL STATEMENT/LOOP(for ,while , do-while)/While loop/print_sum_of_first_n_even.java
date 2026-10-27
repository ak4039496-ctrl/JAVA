// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of first n even numbers 

public class print_sum_of_first_n_even {
    public static void main(String[] args) {
        int n = 10; // number of even terms
        int i = 1; // counter
        int sum = 0; // store sum
        int count = 0; // count of even numbers

        while (count < n) {
            if (i % 2 == 0) {
                sum += i; // add even number
                count++; // increase count when no. is even
            }
            i++; // move to next number
        }

        System.out.println("Sum of first " + n + " even numbers => " + sum);
    }
}
