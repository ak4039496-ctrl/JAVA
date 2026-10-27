// Author: Amit Gupta
// Date: 05-09-2026
// Program: Print sum of series 1 + 2 + 3 + ... + n 

public class print_sum_of_series {
    public static void main(String[] args) {
        int n = 10; // limit of series
        int i = 1; // start with 1
        int sum = 0; // variable to store sum

        // loop until i <= n
        while (i <= n) {
            sum += i; // add current number
            i++; // move to next number
        }

        System.out.println("Sum of series => " + sum); // print result
    }
}
