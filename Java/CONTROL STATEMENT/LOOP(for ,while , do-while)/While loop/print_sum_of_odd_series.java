// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print sum of odd numbers between 1 and 30 using while loop

public class print_sum_of_odd_series {
    public static void main(String[] args) {
        int i = 1; // start with first odd
        int sum = 0; // store sum

        // loop until i <= 30
        while (i <= 30) {
            sum += i; // add odd number
            i += 2; // move to next odd
        }

        System.out.println("Sum of odd numbers => " + sum);
    }
}
