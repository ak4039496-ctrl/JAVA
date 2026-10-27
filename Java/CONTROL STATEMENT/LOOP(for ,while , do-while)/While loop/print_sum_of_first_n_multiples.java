// Author: Amit Gupta
// Date: 25-09-2026
// Program: Find sum of first n multiples of 7

public class print_sum_of_first_n_multiples {
    public static void main(String[] args) {
        int n = 5; // number of multiples
        int i = 1; // counter
        int sum = 0; // store sum

        while (i <= n) {
            sum += (7 * i); // add multiple of 7
            i++; // move to next multiple
        }

        System.out.println("Sum of first " + n + " multiples of 7 => " + sum);
    }
}
