// Author: Amit Gupta
// Date: 05-09-2026
// Program: Find sum of odd numbers up to n using while loop

public class sum_odd_n {
    public static void main(String[] args) {
        int n = 20; // limit
        int i = 1; // start with first odd number
        int sum = 0; // variable to store sum

        while (i <= n) {
            sum += i; // add current odd number
            i += 2; // move to next odd number
        }

        System.out.println("Sum of odd numbers up to " + n + " => " + sum);
    }
}
