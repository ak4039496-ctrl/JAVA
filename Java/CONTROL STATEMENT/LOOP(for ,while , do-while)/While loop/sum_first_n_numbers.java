// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of first n numbers 

public class sum_first_n_numbers {
    public static void main(String[] args) {
        int n = 10; // limit
        int i = 1; // start with 1
        int sum = 0; // variable to store sum

        while (i <= n) {
            sum += i; // add current number
            i++; // move to next number
        }

        System.out.println("Sum of first " + n + " numbers => " + sum);
    }
}
