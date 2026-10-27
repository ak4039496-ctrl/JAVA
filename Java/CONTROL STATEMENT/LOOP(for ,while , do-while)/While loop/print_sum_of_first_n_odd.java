// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of first n odd numbers 
public class print_sum_of_first_n_odd {
    public static void main(String[] args) {
        int n = 10; // number of odd terms
        int i = 1; // counter
        int sum = 0; // store sum
        int count = 0; // count of odd numbers

        while (count < n) {
            if (i % 2 != 0) {
                sum += i; // add odd number
                count++; // increase count
            }
            i++; // move to next number
        }

        System.out.println("Sum of first " + n + " odd numbers => " + sum);
    }
}
