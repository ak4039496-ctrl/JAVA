// Author: Amit Gupta
// Date: 15-09-2026
// Program: Print sum of even numbers between 1 and 30 

public class print_sum_of_even_series {
    public static void main(String[] args) {
        int i = 2; // start with first even
        int sum = 0; // store sum

        // loop until i <= 30
        while (i <= 30) {
            sum += i; // add even number
            i += 2; // move to next even
        }

        System.out.println("Sum of even numbers => " + sum);
    }
}
